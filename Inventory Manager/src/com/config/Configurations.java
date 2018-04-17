package com.config;

import java.io.*; 

public class Configurations {
        
    public void printData(String server, String port, String schema, 
            String username, String password) throws FileNotFoundException{
        
            String print;
            PrintWriter outFile = new PrintWriter("config.yml");
            
            print = "===Mysql Server Connection===\n"+
                    "Server: " + server + "\n" +
                    "Port: " + port + "\n" +
                    "Schema: " + schema + "\n" +
                    "Username: " + username + "\n" +
                    "Password: " + password + "\n" +
                    "===Application Config===\n";
            
            outFile.print(print);
            outFile.close();
        }
    
}
      