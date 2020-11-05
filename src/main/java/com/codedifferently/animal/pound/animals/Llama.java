package com.codedifferently.animal.pound.animals;

import java.util.Date;

public class Llama extends Mammal {

    public Llama(String name, Date birthDate, Integer id) {
        super(name, birthDate, id); //super calls the parent extended class mammal.
    }

    @Override
    public String speak() {
        return "errrrrffffff";
    }


}
