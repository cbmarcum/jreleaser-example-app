package com.acme;

/**
 * Class to print Hello world
 */
public class Main {
    public static void main(String[] args) {
        String name = "World Carl";
        if (args != null && args.length > 0) name = args[0];
        System.out.println("Hello " + name);
    }
}
