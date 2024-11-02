package com.company.abstract_factory.website;

import com.company.abstract_factory.Developer;
import com.company.abstract_factory.ProductOwner;
import com.company.abstract_factory.ProjectTeamFactory;
import com.company.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester createTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner createProductOwner() {
        return new WebsitePO();
    }
}
