package database;


import java.sql.*;

public class DbConnection {
    Connection con = null;
    public static Connection ConnectionDB(){

    try{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:healthcaredb.db");
        System.out.println("connected");
        return con;
                }
    catch(Exception e){
            System.out.print("failed connection \n");
            System.out.print(e);
            return null;
            }
}
}
