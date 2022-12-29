package com.acme;

/**
 * Class to print Hello Everyone
 */
public class Main {
    public static void main(String[] args) {
        String name = "Everyone";
        if (args != null && args.length > 0) name = args[0];
        System.out.println("Hello " + name);
    }
}
