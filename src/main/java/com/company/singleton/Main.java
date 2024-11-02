package com.company.singleton;

public class Main {
    public static void main(String[] args) {
        var dbConnection = DbConnection.getInstance();
        dbConnection.addQuery("select * from employee");
        dbConnection.addQuery("select d.name as department, count(e) as count from employee e, department d" +
                "where e.department=d.id group by d.name");
        dbConnection.showQueryHistory();
    }
}
