package com.company.abstract_factory.website;

import com.company.abstract_factory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer write code");
    }
}
