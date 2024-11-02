package com.company.abstract_factory;

import com.company.abstract_factory.banking.BankingTeamFactory;
import com.company.abstract_factory.website.WebsiteTeamFactory;

import static com.company.abstract_factory.ProjectTeams.*;

public class Main {
    public static void main(String[] args) {
        var teamFactory = getProjectTeamFactoryByTeam(WEBSITE);
        var developer = teamFactory.createDeveloper();
        var tester = teamFactory.createTester();
        var po = teamFactory.createProductOwner();

        System.out.println("Building app");
        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }

    private static ProjectTeamFactory getProjectTeamFactoryByTeam(ProjectTeams teams) {
        return switch (teams) {
            case BANKING -> new BankingTeamFactory();
            case WEBSITE -> new WebsiteTeamFactory();
        };
    }
}
