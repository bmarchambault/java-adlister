import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class JDBCTest {
    //    public static void main(String[] args) {
    private static List<String> getEmployeesFirstName () {
        List<String> names = new ArrayList<>();
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false", "root", "codeup");
            Statement statement = connection.createStatement();
//                its red, but intellij doesn't usually catch all mysql stuff.  if it runs it's fine.
            ResultSet rs = statement.executeQuery("SELECT first_name FROM employees.employees LIMIT 10 ");
            while (rs.next()) {
                names.add(rs.getString("first_name"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return names;
    }

    public static void main(String[] args) {
        System.out.println(getEmployeesFirstName());
//        System.out.println(getEmployeesFirstName(3));
    }
}

//        instructors solution:
//
//    private static List<String> getEmployeesFirstName () {
//        List<String> names = new ArrayList<>();
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
//            "root",
//            "codeup");
//            Statement statement = connection.createStatement();
//            String query = "SELECT first_name FROM employees.employees LIMIT 10";
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                names.add(rs.getString(1));
//            }
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return names;
//    }

//    private static List<String> getEmployeesFirstName (int numberOfNames) {
//        List<String> names = new ArrayList<>();
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
//            "root",
//            "codeup");
//            Statement statement = connection.createStatement();
//            String query = "SELECT first_name FROM employees.employees LIMIT 10" + numberOfNames;
//            ResultSet rs = statement.executeQuery(query);
//            while (rs.next()) {
//                names.add(rs.getString(1));
//            }
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return names;
//    }
