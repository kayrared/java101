package com.example.java101;
import java.util.Scanner;

public class RecursiveIleUsHesaplama {

static int power(int a, int b){
    if (b == 0){
        return 1;
    } else {

        return  a * power (a, b -1 );
    }
}
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

       while(true) {
           System.out.print("Taban değer giriniz: ");
           int a = input.nextInt();

           System.out.print("Üs değerini giriniz: ");
           int b = input.nextInt();

           int result = power(a, b);
           System.out.println("Sonuç: " + power(a, b));
       }
    }
}
