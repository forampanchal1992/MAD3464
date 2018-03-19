import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 711475
 */
public class JDBCOperations {
    
    static Connection conn;
    static PreparedStatement stmt;
    static ResultSet rs = null;
    static String USER = "root";
    static String PASS = "";
    
    public static void main(String [] args)
    {
        connectDB();
        selectDB();
        insertDB();
        deleteDB();
        updateDB();
        closeDB();
    }
    
    
    static void connectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/madwinter", USER,PASS);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    static void insertDB()
    {   try
        {
            stmt = conn.prepareStatement("insert into person values(?,?,?,?)");
            stmt.setInt(1,102); //1 specifies the first parameter in the query
            stmt.setString(2,"Harsh");
            stmt.setString(3,"Patel");
            stmt.setInt(4,12);
            
            int  i= stmt.executeUpdate();
            System.out.println(i+ "records inserted");
         }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    static void selectDB()
    {
        try
        {
            stmt = conn.prepareStatement("Select * from person");
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                System.out.println("ID: " +rs.getInt(1) + "FirstName: " +rs.getString("FirstName")+ "LastName: " + rs.getString("LastName")+ "Age: " +rs.getString("Age"));
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    static void deleteDB()
    {
        try
        {
            stmt = conn.prepareStatement("delete from person where Id = (?)");
            stmt.setInt(1,102); //1 specifies the first parameter in the query
           // stmt.setString(2,"Harsh");
           // stmt.setString(3,"Patel");
           // stmt.setInt(4,12);
           
            int  nrec= stmt.executeUpdate();
            System.out.println(nrec+ "records inserted");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    static void updateDB()
    {
        try
        {
            stmt = conn.prepareStatement("update person  set FirstName = ?, LastName = ?, Age = ? where Id = ?");
            //1 specifies the first parameter in the query
            stmt.setString(1,"Foram");
            stmt.setString(2,"Patel");
            stmt.setInt(3,45);
            stmt.setInt(4,101); 
           
            int  i= stmt.executeUpdate();
            System.out.println(i+ "records inserted");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    static void closeDB()
    {
        try{
            if(conn != null)
            {
                conn.close();
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
