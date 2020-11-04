package com.codedifferently.animal.pound.animals.animal_creation;

import com.codedifferently.animal.pound.animals.Cat;
import com.codedifferently.animal.pound.animals.Dog;
import com.codedifferently.animal.pound.animals.animal_storage.CatHouse;
import com.codedifferently.animal.pound.animals.animal_storage.DogHouse;

import java.util.Date;

public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        Integer newId = DogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        Integer newId = CatHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
    }
}
