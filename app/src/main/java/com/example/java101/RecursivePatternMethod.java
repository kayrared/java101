package com.example.java101;
import java.util.Scanner;

public class RecursivePatternMethod {

static void processNumber(int number){
    System.out.print(number + " ");

    if (number <= 0){
        return ;
    }

    processNumber(number - 5 );

   System.out.print( number + " ");
}
     public static void main(String args[]){
         Scanner input = new Scanner(System.in);

         System.out.print("N Sayısı: ");
         int n = input.nextInt();

processNumber(n);
     }
}
