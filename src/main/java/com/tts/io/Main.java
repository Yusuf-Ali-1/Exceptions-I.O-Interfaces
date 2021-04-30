package com.tts.io;
import java.io.*;
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

    public static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
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

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String myString = scanner.nextLine();
//
//        System.out.println(myString);
//
//        scanner.close();



        int a = 100;
        int b = 0;
        System.out.println(divideLBYL(a, b));
        System.out.println(divideEAFP(a, b));


        int c = getInt();
        System.out.println("z is " + c);


        int d = getIntLBYL();
        System.out.println("d is " + d);


        int e = getIntEAFP();
        System.out.println("e is " + e);


        int result = divide();
        System.out.println(result);


    }


    }








