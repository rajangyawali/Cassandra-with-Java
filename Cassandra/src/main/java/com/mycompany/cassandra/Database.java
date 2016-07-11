/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Session;

/**
 *
 * @author rajan
 */
public class Database {
    
    private static final Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
    private static final Session session = cluster.connect();
    
    
    
    
    public static void implement(String query){
        session.execute(query);
    }
    
    public static void readDb(String query){
        ResultSet result = session.execute(query);
        System.out.println(result.all());
    }
    
    public static void closed(){
        session.close();
        cluster.close();
    }
    
}
