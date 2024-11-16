package com.ruoyi.business.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;


@RestController
public class MyTableGenerator {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    @PostMapping("/generator")
    public String generator(String url, String username, String password, String db,
                            String tableName, String className) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(url,username,password);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "select column_name ,column_comment ,ordinal_position, data_type from information_schema.columns t where table_schema = '"+db+"' and table_name = '"+tableName+"' ORDER BY ordinal_position asc";
            ResultSet rs = stmt.executeQuery(sql);
            StringBuffer buffer = new StringBuffer();
            buffer.append("public class "+className+" {\n");
            // 展开结果集数据库
            while(rs.next()){
                buffer.append("    //" + rs.getString("column_comment")+"\n");
                buffer.append("    private "+getJavaType(rs.getString("data_type")) + " "+rs.getString("column_name")+";\n");
            }
            buffer.append("}\n");
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
            return buffer.toString();
        } catch (ClassNotFoundException e) {
            return "错误："+e.getMessage();
        } catch (SQLException e) {
            return "错误："+e.getMessage();
        }
    }

    private static String getJavaType(String dataType) {
        if("bigint".equals(dataType)){
            return "Long";
        }else if("int".equals(dataType)){
            return "Integer";
        }else if("varchar".equals(dataType)){
            return "String";
        }else if("datetime".equals(dataType)){
            return "Date";
        }else if("date".equals(dataType)){
            return "Date";
        }else if("float".equals(dataType)){
            return "Float";
        }else {
            return "";
        }
    }
}
