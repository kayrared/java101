package com.example.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class SortingElementsInAnArray {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin Boyutu:");
        int boyut = input.nextInt();
        int dizi[] = new int[boyut];
        int n;

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < boyut; i++){
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = input.nextInt();
            }

        Arrays.sort(dizi);

        System.out.println("Sıralama: ");
        for (int i = 0; i < boyut; i++) {
            System.out.print(dizi[i] + " ");
        }


        }
    }
