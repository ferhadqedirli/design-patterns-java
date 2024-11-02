package com.company.abstract_factory;

public interface ProjectTeamFactory {
    Developer createDeveloper();

    Tester createTester();

    ProductOwner createProductOwner();
}
