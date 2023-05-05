package com.beligh;

public class AppSample {
    private static final String MESSAGE = "Hello World!";

    public AppSample() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
