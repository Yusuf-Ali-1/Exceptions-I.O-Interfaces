package com.tts.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    private static int divide(int x, int y) {
        return x / y;
    }

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }


    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {
            return 0;
        }
    }


    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                s.nextLine(); // read past end of line, move to next line
                System.out.println("Error - please enter a number");
            }
        }
    }

    public static int getIntLBYL() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter a number.");
        String input = s.next();
        for(int i = 0; i<input.length(); i++) {
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }


    public static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number.");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
    }

    private static int getInt2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number ");
        return s.nextInt();
    }

    public static void acceptName(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input your name: ");


        try{
            String userName = kb.nextLine();
            if(userName.charAt(0) != 'L'){
                throw new LIsNotFirstCharacterException("The first character in your name is not 'L'");
            }

        } catch (LIsNotFirstCharacterException err){
            err.printStackTrace();

        }

        System.out.println("End of method");
    }

    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        System.out.println(divideLBYL(a, b));
        System.out.println(divideEAFP(a, b));


        int c = getInt();
        System.out.println("c is " + c);


        int d = getIntLBYL();
        System.out.println("d is " + d);


        int e = getIntEAFP();
        System.out.println("e is " + e);


        int result = divide();
        System.out.println("The result of the division is: " + result);


        try {
            // here we attempt any code we want to run
            // that may throw an exception
            String[] fruit = new String[2];
            fruit[0] = "apple";
            fruit[1] = "grapes";
            System.out.println("Access element three :" + fruit[3]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Exception thrown  :" + error);
        } finally {
            System.out.println("Finally, out of the block");
        }

        acceptName();
    }



}


