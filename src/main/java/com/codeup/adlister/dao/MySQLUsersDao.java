package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users {
    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    

    @Override
    public User findByUsername(String username) {
        PreparedStatement statement = null;
        String usernameQuerySearch = "SELECT username FROM users WHERE username = ?";
        String userInput = "%" + username + "%";


        try{
            statement = connection.prepareStatement(usernameQuerySearch);
            statement.setString(1, userInput);
            return extractUser(statement.executeQuery()) ;

            }catch (SQLException e) {
//            this needs to be a runtime error because of the return type
            throw new RuntimeException("Error retrieving from query", e);
        }
        }



    @Override
    public Long insert(User user) {
       PreparedStatement statement = null;
       String insertQuery = "INSERT INTO users (id, username, email, password) VALUES (?, ?, ?, ?)";
       try{
           statement= connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
           statement.setLong(1, user.getId());
           statement.setString(2, user.getUsername());
           statement.setString(3, user.getEmail());
           statement.setString(4, user.getPassword());
           statement.executeUpdate();
           ResultSet rs = statement.getGeneratedKeys();
           rs.next();
           return rs.getLong(1);
       }catch (SQLException e){
           throw new RuntimeException("Error creating a new user", e);
       }
    }

    private User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    private List<User> createUsersFromResults(ResultSet rs) throws SQLException {
        List<User> users = new ArrayList<>();
        while (rs.next()) {
            users.add(extractUser(rs));
        }
        return users;
    }
}
