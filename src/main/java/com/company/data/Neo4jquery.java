package com.company.data;

import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;

public class Neo4jquery {
    public static final String url = "bolt://206.189.59.54:7687";

    public double depthQuery1(String name, int depth) {
        Session session = new Neo4jConnector().connectToNEO4J(url);
        String query = "match(:Person{name: '" + name +"'})-[*" + depth + "]->(other) return count(other)";

        double startTime = System.nanoTime();
        StatementResult result = session.run(query);
        while (result.hasNext()) {
            Record record = result.next();
        }
        double stopTime = System.nanoTime();
        double resultTime = (stopTime - startTime) / 1000000000;
        return resultTime;
    }
}
