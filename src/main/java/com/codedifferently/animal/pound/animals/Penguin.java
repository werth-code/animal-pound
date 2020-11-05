package com.codedifferently.animal.pound.animals;

import java.util.Date;

public class Penguin extends Mammal {

    public Penguin(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    @Override
    public String speak() {
        return "EEaaaaaaaaaa!!";
    }
}
