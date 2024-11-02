package com.company.singleton;

public class DbConnection {
    private static DbConnection dbConnection;
    private static String queryHistory = "Query history: \n";

    private DbConnection() {}

    public static DbConnection getInstance() {
        if (dbConnection == null) dbConnection = new DbConnection();
        return dbConnection;
    }

    public void addQuery(String query) {
        queryHistory += query + "\n";
    }

    public void showQueryHistory() {
        System.out.println(queryHistory);
    }
}
