package com.company;

import com.company.data.Calculate;
import com.company.data.Neo4jquery;
import com.company.data.PSQLquery;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        List<Double> psqlDepth1List = new ArrayList<Double>();
        List<Double> psqlDepth2List = new ArrayList<Double>();
        List<Double> psqlDepth3List = new ArrayList<Double>();
        List<Double> psqlDepth4List = new ArrayList<Double>();
        List<Double> psqlDepth5List = new ArrayList<Double>();

        Calculate calculate = new Calculate();
        PSQLquery psqlQuery = new PSQLquery();
        Neo4jquery neo4jquery = new Neo4jquery();

//        double neo4jDepth1Average = neo4jquery.depthQuery1("Jeanie Mountcastle", 1);
//        System.out.println("Test: " + neo4jDepth1Average);

        psqlDepth1List = depthLists1(psqlQuery);
        double psqlDepth1Average = calculate.calculateAverage(psqlDepth1List);
        double psqlDepth1Median = calculate.calculateMedian(psqlDepth1List);
        System.out.println("Query execution time in seconds:");
        System.out.println();
        System.out.printf("%20s %20s %20s %20s %20s", "", "PSQL Average", "PSQL Median", "NEO4J Average", "NEO4J Median");
        System.out.println();
        System.out.printf("%20s %20s %20s %20s %20s", "Depth 1: ",  psqlDepth1Average + "s.", psqlDepth1Median + "s.", null, null);

        psqlDepth2List = depthLists2(psqlQuery);
        double psqlDepth2Average = calculate.calculateAverage(psqlDepth2List);
        double psqlDepth2Median = calculate.calculateMedian(psqlDepth2List);
        System.out.println();
        System.out.printf("%20s %20s %20s %20s %20s", "Depth 2: ",  psqlDepth2Average + "s.", psqlDepth2Median + "s.", null, null);

        psqlDepth3List = depthLists3(psqlQuery);
        double psqlDepth3Average = calculate.calculateAverage(psqlDepth3List);
        double psqlDepth3Median = calculate.calculateMedian(psqlDepth3List);
        System.out.println();
        System.out.printf("%20s %20s %20s %20s %20s", "Depth 3: ",  psqlDepth3Average + "s.", psqlDepth3Median + "s.", null, null);

        psqlDepth4List = depthLists4(psqlQuery);
        double psqlDepth4Average = calculate.calculateAverage(psqlDepth4List);
        double psqlDepth4Median = calculate.calculateMedian(psqlDepth4List);
        System.out.println();
        System.out.printf("%20s %20s %20s %20s %20s", "Depth 4: ",  psqlDepth4Average + "s.", psqlDepth4Median + "s.", null, null);

        psqlDepth5List = depthLists5(psqlQuery);
        double psqlDepth5Average = calculate.calculateAverage(psqlDepth5List);
        double psqlDepth5Median = calculate.calculateMedian(psqlDepth5List);
        System.out.println();
        System.out.printf("%20s %20s %20s %20s %20s", "Depth 5: ",  psqlDepth5Average + "s.", psqlDepth5Median + "s.", null, null);
    }

    public static List<Double> depthLists1(PSQLquery psqlQuery) throws SQLException, ClassNotFoundException {
        List<Double> psqlDepth1List = new ArrayList<Double>();

        double psqlPerson1 = psqlQuery.depthQuery1("Jeanie Mountcastle");
        psqlDepth1List.add(psqlPerson1);
        double psqlPerson2 = psqlQuery.depthQuery1("Kindra Ryser");
        psqlDepth1List.add(psqlPerson2);
        double psqlPerson3 = psqlQuery.depthQuery1("Royce Fadely");
        psqlDepth1List.add(psqlPerson3);
        double psqlPerson4 = psqlQuery.depthQuery1("Nevada Albarran");
        psqlDepth1List.add(psqlPerson4);
        double psqlPerson5 = psqlQuery.depthQuery1("Gayla Brase");
        psqlDepth1List.add(psqlPerson5);
        double psqlPerson6 = psqlQuery.depthQuery1("Wilhelmina Beltram");
        psqlDepth1List.add(psqlPerson6);
        double psqlPerson7 = psqlQuery.depthQuery1("Ena Walin");
        psqlDepth1List.add(psqlPerson7);
        double psqlPerson8 = psqlQuery.depthQuery1("Antonette Barthen");
        psqlDepth1List.add(psqlPerson8);
        double psqlPerson9 = psqlQuery.depthQuery1("Blanche Kuchenbecker");
        psqlDepth1List.add(psqlPerson9);
        double psqlPerson10 = psqlQuery.depthQuery1("Bibi Sieren");
        psqlDepth1List.add(psqlPerson10);
        double psqlPerson11 = psqlQuery.depthQuery1("Karri Goertzen");
        psqlDepth1List.add(psqlPerson11);
        double psqlPerson12 = psqlQuery.depthQuery1("Doretta Freytas");
        psqlDepth1List.add(psqlPerson12);
        double psqlPerson13 = psqlQuery.depthQuery1("Mayra Vitantonio");
        psqlDepth1List.add(psqlPerson13);
        double psqlPerson14 = psqlQuery.depthQuery1("Casey Phetphongsy");
        psqlDepth1List.add(psqlPerson14);
        double psqlPerson15 = psqlQuery.depthQuery1("Coletta Mateus");
        psqlDepth1List.add(psqlPerson15);
        double psqlPerson16 = psqlQuery.depthQuery1("Loriann Hnot");
        psqlDepth1List.add(psqlPerson16);
        double psqlPerson17 = psqlQuery.depthQuery1("Denyse Aukes");
        psqlDepth1List.add(psqlPerson17);
        double psqlPerson18 = psqlQuery.depthQuery1("Chong Stolte");
        psqlDepth1List.add(psqlPerson18);
        double psqlPerson19 = psqlQuery.depthQuery1("Corene Eska");
        psqlDepth1List.add(psqlPerson19);
        double psqlPerson20 = psqlQuery.depthQuery1("Shirly Orpin");
        psqlDepth1List.add(psqlPerson20);
        return psqlDepth1List;
    }

    public static List<Double> depthLists2(PSQLquery psqlQuery) throws SQLException, ClassNotFoundException {
        List<Double> psqlDepth1List = new ArrayList<Double>();

        double psqlPerson1 = psqlQuery.depthQuery2("Jeanie Mountcastle");
        psqlDepth1List.add(psqlPerson1);
        double psqlPerson2 = psqlQuery.depthQuery2("Kindra Ryser");
        psqlDepth1List.add(psqlPerson2);
        double psqlPerson3 = psqlQuery.depthQuery2("Royce Fadely");
        psqlDepth1List.add(psqlPerson3);
        double psqlPerson4 = psqlQuery.depthQuery2("Nevada Albarran");
        psqlDepth1List.add(psqlPerson4);
        double psqlPerson5 = psqlQuery.depthQuery2("Gayla Brase");
        psqlDepth1List.add(psqlPerson5);
        double psqlPerson6 = psqlQuery.depthQuery2("Wilhelmina Beltram");
        psqlDepth1List.add(psqlPerson6);
        double psqlPerson7 = psqlQuery.depthQuery2("Ena Walin");
        psqlDepth1List.add(psqlPerson7);
        double psqlPerson8 = psqlQuery.depthQuery2("Antonette Barthen");
        psqlDepth1List.add(psqlPerson8);
        double psqlPerson9 = psqlQuery.depthQuery2("Blanche Kuchenbecker");
        psqlDepth1List.add(psqlPerson9);
        double psqlPerson10 = psqlQuery.depthQuery2("Bibi Sieren");
        psqlDepth1List.add(psqlPerson10);
        double psqlPerson11 = psqlQuery.depthQuery2("Karri Goertzen");
        psqlDepth1List.add(psqlPerson11);
        double psqlPerson12 = psqlQuery.depthQuery2("Doretta Freytas");
        psqlDepth1List.add(psqlPerson12);
        double psqlPerson13 = psqlQuery.depthQuery2("Mayra Vitantonio");
        psqlDepth1List.add(psqlPerson13);
        double psqlPerson14 = psqlQuery.depthQuery2("Casey Phetphongsy");
        psqlDepth1List.add(psqlPerson14);
        double psqlPerson15 = psqlQuery.depthQuery2("Coletta Mateus");
        psqlDepth1List.add(psqlPerson15);
        double psqlPerson16 = psqlQuery.depthQuery2("Loriann Hnot");
        psqlDepth1List.add(psqlPerson16);
        double psqlPerson17 = psqlQuery.depthQuery2("Denyse Aukes");
        psqlDepth1List.add(psqlPerson17);
        double psqlPerson18 = psqlQuery.depthQuery2("Chong Stolte");
        psqlDepth1List.add(psqlPerson18);
        double psqlPerson19 = psqlQuery.depthQuery2("Corene Eska");
        psqlDepth1List.add(psqlPerson19);
        double psqlPerson20 = psqlQuery.depthQuery2("Shirly Orpin");
        psqlDepth1List.add(psqlPerson20);
        return psqlDepth1List;
    }

    public static List<Double> depthLists3(PSQLquery psqlQuery) throws SQLException, ClassNotFoundException {
        List<Double> psqlDepth1List = new ArrayList<Double>();

        double psqlPerson1 = psqlQuery.depthQuery3("Jeanie Mountcastle");
        psqlDepth1List.add(psqlPerson1);
        double psqlPerson2 = psqlQuery.depthQuery3("Kindra Ryser");
        psqlDepth1List.add(psqlPerson2);
        double psqlPerson3 = psqlQuery.depthQuery3("Royce Fadely");
        psqlDepth1List.add(psqlPerson3);
        double psqlPerson4 = psqlQuery.depthQuery3("Nevada Albarran");
        psqlDepth1List.add(psqlPerson4);
        double psqlPerson5 = psqlQuery.depthQuery3("Gayla Brase");
        psqlDepth1List.add(psqlPerson5);
        double psqlPerson6 = psqlQuery.depthQuery3("Wilhelmina Beltram");
        psqlDepth1List.add(psqlPerson6);
        double psqlPerson7 = psqlQuery.depthQuery3("Ena Walin");
        psqlDepth1List.add(psqlPerson7);
        double psqlPerson8 = psqlQuery.depthQuery3("Antonette Barthen");
        psqlDepth1List.add(psqlPerson8);
        double psqlPerson9 = psqlQuery.depthQuery3("Blanche Kuchenbecker");
        psqlDepth1List.add(psqlPerson9);
        double psqlPerson10 = psqlQuery.depthQuery3("Bibi Sieren");
        psqlDepth1List.add(psqlPerson10);
        double psqlPerson11 = psqlQuery.depthQuery3("Karri Goertzen");
        psqlDepth1List.add(psqlPerson11);
        double psqlPerson12 = psqlQuery.depthQuery3("Doretta Freytas");
        psqlDepth1List.add(psqlPerson12);
        double psqlPerson13 = psqlQuery.depthQuery3("Mayra Vitantonio");
        psqlDepth1List.add(psqlPerson13);
        double psqlPerson14 = psqlQuery.depthQuery3("Casey Phetphongsy");
        psqlDepth1List.add(psqlPerson14);
        double psqlPerson15 = psqlQuery.depthQuery3("Coletta Mateus");
        psqlDepth1List.add(psqlPerson15);
        double psqlPerson16 = psqlQuery.depthQuery3("Loriann Hnot");
        psqlDepth1List.add(psqlPerson16);
        double psqlPerson17 = psqlQuery.depthQuery3("Denyse Aukes");
        psqlDepth1List.add(psqlPerson17);
        double psqlPerson18 = psqlQuery.depthQuery3("Chong Stolte");
        psqlDepth1List.add(psqlPerson18);
        double psqlPerson19 = psqlQuery.depthQuery3("Corene Eska");
        psqlDepth1List.add(psqlPerson19);
        double psqlPerson20 = psqlQuery.depthQuery3("Shirly Orpin");
        psqlDepth1List.add(psqlPerson20);
        return psqlDepth1List;
    }

    public static List<Double> depthLists4(PSQLquery psqlQuery) throws SQLException, ClassNotFoundException {
        List<Double> psqlDepth1List = new ArrayList<Double>();

        double psqlPerson1 = psqlQuery.depthQuery4("Jeanie Mountcastle");
        psqlDepth1List.add(psqlPerson1);
        double psqlPerson2 = psqlQuery.depthQuery4("Kindra Ryser");
        psqlDepth1List.add(psqlPerson2);
        double psqlPerson3 = psqlQuery.depthQuery4("Royce Fadely");
        psqlDepth1List.add(psqlPerson3);
        double psqlPerson4 = psqlQuery.depthQuery4("Nevada Albarran");
        psqlDepth1List.add(psqlPerson4);
        double psqlPerson5 = psqlQuery.depthQuery4("Gayla Brase");
        psqlDepth1List.add(psqlPerson5);
        double psqlPerson6 = psqlQuery.depthQuery4("Wilhelmina Beltram");
        psqlDepth1List.add(psqlPerson6);
        double psqlPerson7 = psqlQuery.depthQuery4("Ena Walin");
        psqlDepth1List.add(psqlPerson7);
        double psqlPerson8 = psqlQuery.depthQuery4("Antonette Barthen");
        psqlDepth1List.add(psqlPerson8);
        double psqlPerson9 = psqlQuery.depthQuery4("Blanche Kuchenbecker");
        psqlDepth1List.add(psqlPerson9);
        double psqlPerson10 = psqlQuery.depthQuery4("Bibi Sieren");
        psqlDepth1List.add(psqlPerson10);
        double psqlPerson11 = psqlQuery.depthQuery4("Karri Goertzen");
        psqlDepth1List.add(psqlPerson11);
        double psqlPerson12 = psqlQuery.depthQuery4("Doretta Freytas");
        psqlDepth1List.add(psqlPerson12);
        double psqlPerson13 = psqlQuery.depthQuery4("Mayra Vitantonio");
        psqlDepth1List.add(psqlPerson13);
        double psqlPerson14 = psqlQuery.depthQuery4("Casey Phetphongsy");
        psqlDepth1List.add(psqlPerson14);
        double psqlPerson15 = psqlQuery.depthQuery4("Coletta Mateus");
        psqlDepth1List.add(psqlPerson15);
        double psqlPerson16 = psqlQuery.depthQuery4("Loriann Hnot");
        psqlDepth1List.add(psqlPerson16);
        double psqlPerson17 = psqlQuery.depthQuery4("Denyse Aukes");
        psqlDepth1List.add(psqlPerson17);
        double psqlPerson18 = psqlQuery.depthQuery4("Chong Stolte");
        psqlDepth1List.add(psqlPerson18);
        double psqlPerson19 = psqlQuery.depthQuery4("Corene Eska");
        psqlDepth1List.add(psqlPerson19);
        double psqlPerson20 = psqlQuery.depthQuery4("Shirly Orpin");
        psqlDepth1List.add(psqlPerson20);
        return psqlDepth1List;
    }

    public static List<Double> depthLists5(PSQLquery psqlQuery) throws SQLException, ClassNotFoundException {
        List<Double> psqlDepth1List = new ArrayList<Double>();

        double psqlPerson1 = psqlQuery.depthQuery5("Jeanie Mountcastle");
        psqlDepth1List.add(psqlPerson1);
        double psqlPerson2 = psqlQuery.depthQuery5("Kindra Ryser");
        psqlDepth1List.add(psqlPerson2);
        double psqlPerson3 = psqlQuery.depthQuery5("Royce Fadely");
        psqlDepth1List.add(psqlPerson3);
        double psqlPerson4 = psqlQuery.depthQuery5("Nevada Albarran");
        psqlDepth1List.add(psqlPerson4);
        double psqlPerson5 = psqlQuery.depthQuery5("Gayla Brase");
        psqlDepth1List.add(psqlPerson5);
        double psqlPerson6 = psqlQuery.depthQuery5("Wilhelmina Beltram");
        psqlDepth1List.add(psqlPerson6);
        double psqlPerson7 = psqlQuery.depthQuery5("Ena Walin");
        psqlDepth1List.add(psqlPerson7);
        double psqlPerson8 = psqlQuery.depthQuery5("Antonette Barthen");
        psqlDepth1List.add(psqlPerson8);
        double psqlPerson9 = psqlQuery.depthQuery5("Blanche Kuchenbecker");
        psqlDepth1List.add(psqlPerson9);
        double psqlPerson10 = psqlQuery.depthQuery5("Bibi Sieren");
        psqlDepth1List.add(psqlPerson10);
        double psqlPerson11 = psqlQuery.depthQuery5("Karri Goertzen");
        psqlDepth1List.add(psqlPerson11);
        double psqlPerson12 = psqlQuery.depthQuery5("Doretta Freytas");
        psqlDepth1List.add(psqlPerson12);
        double psqlPerson13 = psqlQuery.depthQuery5("Mayra Vitantonio");
        psqlDepth1List.add(psqlPerson13);
        double psqlPerson14 = psqlQuery.depthQuery5("Casey Phetphongsy");
        psqlDepth1List.add(psqlPerson14);
        double psqlPerson15 = psqlQuery.depthQuery5("Coletta Mateus");
        psqlDepth1List.add(psqlPerson15);
        double psqlPerson16 = psqlQuery.depthQuery5("Loriann Hnot");
        psqlDepth1List.add(psqlPerson16);
        double psqlPerson17 = psqlQuery.depthQuery5("Denyse Aukes");
        psqlDepth1List.add(psqlPerson17);
        double psqlPerson18 = psqlQuery.depthQuery5("Chong Stolte");
        psqlDepth1List.add(psqlPerson18);
        double psqlPerson19 = psqlQuery.depthQuery5("Corene Eska");
        psqlDepth1List.add(psqlPerson19);
        double psqlPerson20 = psqlQuery.depthQuery5("Shirly Orpin");
        psqlDepth1List.add(psqlPerson20);
        return psqlDepth1List;
    }

}
