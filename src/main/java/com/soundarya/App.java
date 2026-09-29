package com.soundarya;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public String greet(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println(app.greet("Soundarya"));
        System.out.println("Addition: " + app.add(10, 20));
    }
}
