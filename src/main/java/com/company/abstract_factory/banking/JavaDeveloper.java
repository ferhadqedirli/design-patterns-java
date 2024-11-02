package com.company.abstract_factory.banking;

import com.company.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write code");
    }
}
