package com.example.java101;

import java.util.Scanner;

public class RecursiveAsalSayilar {


static boolean asalMi(int sayi, int i){
    if (sayi < 1){
      return false;
    }

    if (i == sayi / 2) {
        return true;
    }

    if (sayi % i == 0) {
        return false;
    }

    return asalMi(sayi, i);

}

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        if (asalMi(sayi,2)){

            System.out.print(sayi + ": Asal");
        } else {
            System.out.println(sayi + ": Asal değil");
        }











    }
}
