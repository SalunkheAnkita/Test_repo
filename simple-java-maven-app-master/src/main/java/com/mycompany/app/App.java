package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        //System.out.println(new App().showMessage());
    }

    private final String getMessage() {
        return message;
    }

	private final String showMessage() {
        return message;
    }
 private final String printMessage() {
        return message;
    }


}
