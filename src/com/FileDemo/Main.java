package com.FileDemo;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "";

        try(Connection conn = DriverManager.getConnection(url,username,password)){
            System.out.println("Done");
        }
    }
}
