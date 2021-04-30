package com.tts.exceptions;

public class SayProperGreetingException extends Exception {
    String greeting;

    public SayProperGreetingException(String greeting) {
        this.greeting = greeting;
        System.out.println(greeting + " is not an appropiate greeting.");
    }

    public String sayHello() {
        return greeting;
    }
}