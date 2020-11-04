package com.codedifferently.animal.pound.animals;

import com.codedifferently.animal.pound.Food;

public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
