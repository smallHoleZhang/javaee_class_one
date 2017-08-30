package org.db;

import org.login;

import java.sql.*;

/**
 * Created by hasee on 2017/8/29.
 */
public class DBcom {
    public static final String url = "jdbc:mysql://localhost:3306/student?"
            + "user=root&password=root&useUnicode=true&characterEncoding=UTF8";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String users = "root";
    public static final String password = "695509zhang";

    public static Connection conn = null;


    public static Connection getconn () {
        try {
            Class.forName(name);//指定连接类型
            System.out.println("成功加载MySQL驱动程序");
            conn = DriverManager.getConnection(url, users, password);//获取连接
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败加载MySQL驱动程序"+e.toString());
            return null;
        }
    }

    /*public static void close() {
        try {


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
*/
/*    public static void main(String[] args) throws SQLException {

        try {
            Class.forName(name);//指定连接类型
            System.out.println("成功加载MySQL驱动程序");
            conn = DriverManager.getConnection(url, users, password);//获取连接

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("失败加载MySQL驱动程序"+e.toString());

        }

             PreparedStatement pstm = conn.prepareStatement(
                "SELECT * FROM user WHERE username=?"+"and password=?"
            );

        pstm.setString(1,"123");
        pstm.setString(2,"123");
        ResultSet rs = pstm.executeQuery();

        if(rs.next()) {
            login login = new login();
            login.setId(rs.getString(3));
            login.setName(rs.getString(1));
            login.setPassword(rs.getString(2));
            System.out.println(login.getName());


        }
    }*/
    }
