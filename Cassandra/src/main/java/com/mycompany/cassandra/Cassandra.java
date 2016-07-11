/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandra;

/**
 *
 * @author rajan
 */
public class Cassandra {
public static void main(String[] args) {
        System.out.println("Welcome to the project with Cassandra.");
        
       // Query for creating keyspace.
       String query1 = "CREATE KEYSPACE Hello "
               + "WITH replication = {'class':'SimpleStrategy','replication_factor':1};";
       Database.implement(query1);
        System.out.println("The keyspace Hello has been created.");
       
       //Query for using keyspace
       String query2 = "USE hello;";
       Database.implement(query2);
        System.out.println("The keyspace Hello has been selected.");
       
       // Query for creating table
       String query3 = "CREATE TABLE hellotable("
               + "id int PRIMARY KEY,"
               + "name text,"
               + "phone varint"
               + ");";
       Database.implement(query3);
        System.out.println("The table named hellotable has been created ");
        
        // Query for adding values.
        String query4 = "INSERT INTO hellotable(id, name, phone)"
                + "VALUES(1,'Ram',9840045678);";
        String query5 = "INSERT INTO hellotable(id, name, phone)"
                + "VALUES(2,'Rohan',9841345677);";
        Database.implement(query4);
        Database.implement(query5);
        
        //Query for reading database
        String query6 = "SELECT * FROM hellotable;";
        Database.readDb(query6);
        
        
        // Closing connection
        Database.closed();
        
    }
    
}
