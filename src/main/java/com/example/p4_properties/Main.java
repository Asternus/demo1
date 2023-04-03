package com.example.p4_properties;


import com.example.p3_javaConfig.p1.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DBConfig.class);

        DBConnection dbConnection = applicationContext.getBean(DBConnection.class);

        Connection connection = dbConnection.getConnection();

        System.out.println("Database: " + connection.getMetaData().getDatabaseProductName());
        System.out.println("Version: " + connection.getMetaData().getDatabaseProductVersion());

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users");

        ResultSet resultSet = preparedStatement.executeQuery();

        List<User> users = new ArrayList<>();

        while (resultSet.next()) {
            long id = resultSet.getInt(1);
            String email = resultSet.getString(2);
            String password = resultSet.getString(3);

            User user = new User(id, email, password);

            users.add(user);
        }

        System.out.println("\nData from table users:");
        users.forEach(System.out::println);

        applicationContext.close();
    }
}
