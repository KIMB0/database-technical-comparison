package com.company.data;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Session;


public class Neo4jConnector {
    public Session connectToNEO4J(String url) {
        Driver driver = GraphDatabase.driver(url,
                AuthTokens.basic("neo4j", "class" ));
        Session session = driver.session();
        return session;
    }
}
