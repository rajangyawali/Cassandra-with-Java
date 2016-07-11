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
public class Database {
    
    
    
    public static void implement(String query){
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();
        session.execute(query);
    }
    
    public static ResultSet read(String query){
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect();
        return session.execute(query);
    }
    
}
