package models;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

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


    @Override
    public List<Ad> all() {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            return createAdsFromResults(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all ads.", e);
        }
    }



    @Override
    public Long insert(Ad ad) {
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }
    private String createInsertQuery(Ad ad) {
        return "INSERT INTO ads(user_id, title, description) VALUES "
                + "(" + ad.getUserId() + ", "
                + "'" + ad.getTitle() +"', "
                + "'" + ad.getDescription() + "')";
    }

    private Ad extractAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
                rs.getLong("user_id"),
                rs.getString("title"),
                rs.getString("description")
        );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(extractAd(rs));
        }
        return ads;
    }
}