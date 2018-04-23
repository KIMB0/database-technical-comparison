package com.company.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

public class PSQLquery {
    private static final String url = "jdbc:postgresql://206.189.59.54/";
    private static final String user = "postgres";
    private static final String password = "mysecretpassword";

    public double depthQuery1(String name) throws SQLException, ClassNotFoundException {
        Connection connection = new PostgresqlConnector().connectToPSQL(url, user, password);
        Statement statement = connection.createStatement();
        String query = "SELECT count(*) FROM person WHERE id IN ( SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE name='" + name + "'))";

        double startTime = System.nanoTime();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            resultSet.getInt(1);
        }

        double stopTime = System.nanoTime();
        double resultTime = (stopTime - startTime) / 1000000000;
        connection.close();
        return resultTime;
    }

    public double depthQuery2(String name) throws SQLException, ClassNotFoundException {
        Connection connection = new PostgresqlConnector().connectToPSQL(url, user, password);
        Statement statement = connection.createStatement();
        String query = "SELECT count(*) FROM person WHERE id IN ( SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN (SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE name='" + name + "'))))";

        double startTime = System.nanoTime();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            resultSet.getInt(1);
        }

        double stopTime = System.nanoTime();
        double resultTime = (stopTime - startTime) / 1000000000;
        connection.close();
        return resultTime;
    }

    public double depthQuery3(String name) throws SQLException, ClassNotFoundException {
        Connection connection = new PostgresqlConnector().connectToPSQL(url, user, password);
        Statement statement = connection.createStatement();
        String query = "SELECT count(*) FROM person WHERE id IN ( SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN (SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN(SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN(SELECT id FROM person WHERE name='" + name + "'))))))";

        double startTime = System.nanoTime();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            resultSet.getInt(1);
        }

        double stopTime = System.nanoTime();
        double resultTime = (stopTime - startTime) / 1000000000;
        connection.close();
        return resultTime;
    }

    public double depthQuery4(String name) throws SQLException, ClassNotFoundException {
        Connection connection = new PostgresqlConnector().connectToPSQL(url, user, password);
        Statement statement = connection.createStatement();
        String query = "SELECT count(*) FROM person WHERE id IN ( SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN (SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN(SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN(SELECT id FROM person WHERE id IN(SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN(SELECT id FROM person WHERE name='" + name + "'))))))))";

        double startTime = System.nanoTime();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            resultSet.getInt(1);
        }

        double stopTime = System.nanoTime();
        double resultTime = (stopTime - startTime) / 1000000000;
        connection.close();
        return resultTime;
    }

    public double depthQuery5(String name) throws SQLException, ClassNotFoundException {
        Connection connection = new PostgresqlConnector().connectToPSQL(url, user, password);
        Statement statement = connection.createStatement();
        String query = "SELECT count(*) FROM person WHERE id IN ( SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN (SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN (SELECT id FROM person WHERE id IN(SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN(SELECT id FROM person WHERE id IN(SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN(SELECT id FROM person WHERE id IN(SELECT person_two_id FROM endorsement WHERE endorsement.person_one_id IN(SELECT id FROM person WHERE name='" + name + "'))))))))))";

        double startTime = System.nanoTime();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            resultSet.getInt(1);
        }

        double stopTime = System.nanoTime();
        double resultTime = (stopTime - startTime) / 1000000000;
        connection.close();
        return resultTime;
    }
}
