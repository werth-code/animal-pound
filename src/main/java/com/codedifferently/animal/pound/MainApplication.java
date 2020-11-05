package com.codedifferently.animal.pound;

import com.codedifferently.animal.pound.animals.Llama;
import com.codedifferently.animal.pound.animals.Penguin;

import java.util.Date;

public class MainApplication {
    public static void main(String[] args) {
        Llama larry = new Llama("Larry", new Date(), 36);
        System.out.println("Hey you, what is your name? " + larry.speak());

        Penguin patrick = new Penguin("Patrick", new Date(), 23);
        System.out.println("Hey penguin what's a shakin? " + patrick.speak());
    }
}
