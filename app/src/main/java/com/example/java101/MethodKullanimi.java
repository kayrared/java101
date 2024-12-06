package com.example.java101;
import java.util.Scanner;

public class MethodKullanimi {

    static void helloWorld(){
        System.out.print("Hello World");
    }

    static int power(int base, int exp){

        int result = 1;
        for (int i = 1; i <= exp; i++){
            result *= base;
        }
         return result;
    }

    public static void main(String args[]){


 System.out.println(power(3,4));
        System.out.println(power(6,4));
        System.out.println(power(1,4));

helloWorld();








    }

}
