/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package connectivity;


import java.sql.*;


/**
 *
 * @author Fabian
 */
public class DbManager {
    
    private static String JDBC_EXCEPTION = "JDBC Exception: ";
    private static String SQL_EXCEPTION = "SQL Exception: ";
    
    public Connection connection;
    
     /**
     * Open database connection
     */
    public void openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //location and name of the database
            String url = "jdbc:mysql://localhost/zsteurp001";
            //your root and pass for localhost or our connection on the server
            String user = "root", pass = "";
            
            /** Open connection */
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.err.println(JDBC_EXCEPTION + e);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
    }
    
    public void closeConnection(){
    try{
        connection.close();
    }catch(Exception e){
        System.err.println(e.getMessage());
    }
}
    
    /**
     * Executes a query without result.
     * @param query, the SQl query
     */
    public void executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(query);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
    }

    /**
     * Executes a query with result.
     * @param query, the SQL query
     */
    public ResultSet doQuery(String query) {
        //printing query for check
        System.out.println(query);
        ResultSet result = null;
        if(connection == null){
            openConnection();
        }
        try {
            Statement statement = connection.createStatement();
            result = statement.executeQuery(query);
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }
    
    public int doInsert(String query) {
        int result = 0;
        if(connection == null){
            openConnection();
        }
        try {
            Statement statement = connection.createStatement();
            result = statement.executeUpdate(query);
            
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }
    
    
    
    /**
     * Executes a query with result.
     * @param query, the SQL query
     */
    public ResultSet insertQuery(String query) {
        ResultSet result = null;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            result = statement.getGeneratedKeys();
        } catch (java.sql.SQLException e) {
            System.err.println(SQL_EXCEPTION + e);
        }
        return result;
    }
    
}
