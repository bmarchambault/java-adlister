package dao;
import com.mysql.cj.jdbc.Driver;
import models.Ad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

//    from this connection object - we can create statement objects.  each method will have their own statement object.
    public MySQLAdsDao (Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword());
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    RETRIEVE ADS:
//        instantiate a new list.
//        create a query string
//        the query is a mysql language.
//        try/catch for SQL Exception
//        create a statement object
//        statement object executes a query
//        result set that equals the execute query
//        iterate through the result set  and grab values
//        add those values to the list
//        return the list

    @Override
    public List<Ad> all() {
        List <Ad> ads = new ArrayList<>();
        String selectQuery = "SELECT * FROM ads";

        try{
            Statement statement = connection.createStatement();
            ResultSet rs =  statement.executeQuery(selectQuery);
            while(rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id_fk"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return ads;
    }


//    INSERT NEW AD:
    //        works with the form in creating a new ad.  the user inputs data and this method created the new id.  the get post method puts both together.
//        need to know what the last inserted id is.
//       try catch
//        a result set that equates to getting the generated key
//        a statement object that updates the insert and allows access to the generated key
//        last inserted id equals the the last row in the database.  you access that with rs.next.
//        return the last inserted id

    @Override
    public Long insert(Ad ad) {
        long lastInsertedID = 0;

        String insertQuery = String.format("INSERT INTO ads (user_id_fk, title, description, VALUE(%d, '%s', '%s')", ad.getUserId(), ad.getTitle(), ad.getDescription());
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedID = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lastInsertedID;
    }

//√ Create a class named MySQLAdsDao that implements the Ads interface
//
//√ This class should have a private instance property named connection of type Connection that is initialized in the constructor. Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.
//√ Implement the methods in the Ads interface √
//Your methods should retrieve ads from the database and insert new ads into the database
//The connection object will be created just once, in this class' constructor, and the individual methods that query the database should use the connection object to create statements.
//
//In the DaoFactory class, switch out the ListAdsDao for your MySQLAdsDao
//
//You should have to make little, if any, changes to the existing code
//When you create an instance of MySQLAdsDao, create an instance of your Config class to pass to the MySQLAdsDao constructor
//Verify that your application still functions as before, but that now information is being pulled from and saved to your database


}