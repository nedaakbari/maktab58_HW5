package HW5.controller;

import java.sql.*;

public class EmployeeController {
    public static Connection connect2Db() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost:3306/hw5";
        String user = "neda";
        String pass = "13730203@Neda";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static ResultSet runQuery() throws ClassNotFoundException {
        ResultSet rs = null;
        Connection conn = connect2Db();//step1
        Statement stmt = null;
        try {
            stmt = conn.createStatement();//step2
            rs = stmt.executeQuery("select * from employee");//step3
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void showData() throws SQLException, ClassNotFoundException {
        System.out.println("ID\t" + "name\t" + "lastName\t" + "personalcode\t" + "birthdate\t" + "department\t");
        System.out.println("------------------------------------");
        ResultSet rslt = runQuery();
        while (rslt.next()) {
            System.out.print(rslt.getInt("id") + "\t" + rslt.getString(2) + "\t");
            System.out.println(rslt.getString(3) + "\t" + rslt.getString(4) + "\t" + rslt.getString(5) + "\t" + rslt.getString(6) + "\t");
        }

    }

    public static int createEmployee() throws ClassNotFoundException {//قرارره یه یوزر رو insertکنیم
        Connection conn = connect2Db();
        Statement stmt = null;
        Integer id = 0;
        try {
            stmt = conn.createStatement();//step2
            id = stmt.executeUpdate("insert into employee values (4,'fatemeh','1234','ali@email.com','091233333','2001/01/01')");
        } catch (SQLException e) {
            id = -1;
            e.printStackTrace();
        }

        return id;
    }

    public static int updateUser() throws ClassNotFoundException {//update User
        Connection conn = connect2Db();
        Statement stmt = null;
        Integer id = 0;
        try {
            stmt = conn.createStatement();
            id = stmt.executeUpdate("update hw5.employee set name='nimaa' ,lastName='khademi';");
        } catch (SQLException e) {
            id = -1;
            e.printStackTrace();
        }

        return id;
    }
}