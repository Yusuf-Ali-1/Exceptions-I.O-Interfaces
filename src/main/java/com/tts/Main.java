package com.tts;
import java.io.*;
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


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String myString = scanner.nextLine();
//
//        System.out.println(myString);
//
//        scanner.close();



        int x = 100;
        int y = 0;
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));


        int z = getInt();
        System.out.println("z is " + z);
    }


    }





