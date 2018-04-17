package com.mysql;

import com.sun.media.jfxmedia.logging.Logger;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SqlDriver {
    
    protected Connection mycon;
    protected Statement myStatement;
    protected ResultSet result;
    
    protected String server;
    protected String port;
    protected String schema;
    protected String username;
    protected String password;
    
    
    
    public final String LOAD_CLIENT = "SELECT ORG_NAME as NAME, ORG_ADDRESS1 as ADDRESS, ORG_ADDRESS2 ADDRESS2, " +
            "ORG_CONTACT as CONTACT, ORG_TELNUM as TELNUM, ORG_MOBILE as MOBILE, " +
            "ORG_FAX as FAX, ORG_EMAIL as EMAIL from organization " +
            "WHERE ORG_TYPE = 'client'";
    
    public final String LOAD_SUPPLIER = "SELECT ORG_NAME as NAME, ORG_ADDRESS1 as ADDRESS, ORG_ADDRESS2 ADDRESS2, " +
            "ORG_CONTACT as CONTACT, ORG_TELNUM as TELNUM, ORG_MOBILE as MOBILE, " +
            "ORG_FAX as FAX, ORG_EMAIL as EMAIL from organization " +
            "WHERE ORG_TYPE = 'supplier'";
    
    public final String LOAD_PRODUCT = "SELECT PROD_NAME AS NAME, PROD_CODE AS CODE, "
            + "PROD_NET AS NET, PROD_GROSS AS GROSS, PROD_STACK AS STACK "
            + " FROM product";
    
    public void setServer(String x){
        this.server = x;
    }
    public void setPort(String x){
        this.port = x;
    }
    public void setSchema(String x){
        this.schema = x;
    }
    public void setUsername(String x){
        this.username = x;
    }
    public void setPassword(String x){
        this.password = x;
    }
    
    public String getServer(){
        return this.server;
    }
    public String getPort(){
        return this.port;
    }
    public String getSchema(){
        return this.schema;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    
    public void inData() throws FileNotFoundException{
        Scanner inFile = new Scanner(new FileReader("config.yml"));
        String temp;       
        while(inFile.hasNext()){
            temp = inFile.next();
            
            if(temp.equals("Server:")){
                temp = inFile.next();
                this.server = temp;
            }
            else if(temp.equals("Port:")){
                temp = inFile.next();
                this.port = temp;
            }
            else if(temp.equals("Schema:")){
                temp = inFile.next();
                this.schema = temp;
            }
            else if(temp.equals("Username:")){
                temp = inFile.next();
                this.username = temp;
            }
            else if(temp.equals("Password:")){
                temp = inFile.next();
                this.password = temp;
            }  
        } 
    }
    public boolean connectSql(){
        try{
            inData();
            String Connection = "jdbc:mysql://" + this.server + ":" + this.port + "/" + this.schema;
            this.mycon = DriverManager.getConnection(Connection,this.username,this.password);
            JOptionPane.showMessageDialog(null,"Suceeded","Connection Successful!",JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Connection Error",JOptionPane.ERROR_MESSAGE); 
            return false;
        }               
                             
    }
    
    
    
    
    
    
    public int updateQuery(String query){
        
         int key = 0;
        
        try{
            myStatement = mycon.createStatement();
            System.out.println(query);
            myStatement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
           
            result = myStatement.getGeneratedKeys();
            
            if(result.next()){
                key = result.getInt(1);
                System.out.println(key);
            }
                      
        } 
        catch(Exception ex){
            ex.printStackTrace();          
        }
        
        return key;
    }
    
    
    
    
    
    
    public void executeQuery(String query){
        try{
            System.out.println(query);
            
            myStatement = mycon.createStatement();
            result = myStatement.executeQuery(query);
           
        } 
        catch(Exception ex){
            ex.printStackTrace();          
        }
    }
    
    public ResultSet getResult(){
        return result;
    }
}

