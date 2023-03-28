package org.example;

import pojo.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql:///mybatis?serverTimezone=UTC";
        String user="root";
        String password="123456";
        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println(con);

        int uid=2;
        String sql="SELECT * FROM USER WHERE uid=?";
        PreparedStatement prep = con.prepareStatement(sql);
        prep.setInt(1,uid);

        ResultSet rs = prep.executeQuery();
        User u=new User();
        if(rs.next()){
            u.setUid(rs.getInt("uid"));
            u.setUname(rs.getString("uname"));
            u.setUage(rs.getInt("uage"));
        }


        rs.close();
        prep.close();
        con.close();

        System.out.println(u);




    }
}