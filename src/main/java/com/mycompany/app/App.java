package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";
    private static int i = 0;
    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);

        if(MESSAGE == "Hello World!" & i !=0 ){
            System.out.println(true);
        }
    }

    public String getMessage() {
        return MESSAGE;
    }

}
