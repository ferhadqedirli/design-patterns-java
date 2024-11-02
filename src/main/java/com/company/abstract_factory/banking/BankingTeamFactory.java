package com.company.abstract_factory.banking;

import com.company.abstract_factory.Developer;
import com.company.abstract_factory.ProductOwner;
import com.company.abstract_factory.ProjectTeamFactory;
import com.company.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester createTester() {
        return new QATester();
    }

    @Override
    public ProductOwner createProductOwner() {
        return new BankingPO();
    }
}
