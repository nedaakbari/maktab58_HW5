package HW5.controller;

import java.sql.*;

public class departmentController {
    private static final String URL = "jdbc:mysql://localhost:3306/hw5";
    private static final String USERNAME = "neda";
    private static final String PASSWORD = "13730203@Neda";


    public static Connection connect2Db() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static ResultSet runQuery() throws ClassNotFoundException {
        ResultSet rs = null;
        Connection conn = connect2Db();
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
        System.out.println("ID" + "\t" + "name" + "\t" + "phoneNumber" + "\t" + "EmployeeName");
        System.out.println("------------------------------------");
        ResultSet rslt = runQuery();
        while (rslt.next()) {
            System.out.print(rslt.getInt("id") + "\t" + rslt.getString(2) + "\t");
            System.out.println(rslt.getString(3) + "\t" + rslt.getString(4));
        }
    }

    public static int createdepartrment() throws ClassNotFoundException {
        Connection conn = connect2Db();
        Statement stmt = null;
        Integer id = 0;
        try {
            stmt = conn.createStatement();//step2
            id = stmt.executeUpdate("insert into department values (4,'fatemeh','1234','ali@email.com','091233333','2001/01/01')");
        } catch (SQLException e) {
            id = -1;
            e.printStackTrace();
        }

        return id;
    }

    public static int updateDepartment() throws ClassNotFoundException {
        Connection conn = connect2Db();
        Statement stmt = null;
        Integer id = 0;
        try {
            stmt = conn.createStatement();
            id = stmt.executeUpdate("update hw5.department set name='mali';");
        } catch (SQLException e) {
            id = -1;
            e.printStackTrace();
        }

        return id;
    }
}