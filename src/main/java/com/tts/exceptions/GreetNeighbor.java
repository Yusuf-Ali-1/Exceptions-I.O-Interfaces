package com.tts.exceptions;

public class GreetNeighbor {

    public GreetNeighbor() {

    }

    public static void sayHelloNeighbor(String greeting) throws SayProperGreetingException {
        if (greeting.equals("Hello")) {
            System.out.println(greeting + " neighbor!  Welcome!");
        } else {
            throw new SayProperGreetingException(greeting);
        }
    }

    public static void main(String[] args) throws SayProperGreetingException {
        GreetNeighbor welcome = new GreetNeighbor();
        sayHelloNeighbor("Goodbye");
    }
}