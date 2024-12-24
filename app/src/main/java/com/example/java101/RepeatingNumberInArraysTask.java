package com.example.arrays;

public class RepeatingNumberInArraysTask {
    public static void main(String args[]){
        int dizi[] = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean kontrol[] = new boolean[dizi.length];

    for (int i = 0; i < dizi.length; i++){
        if (kontrol[i] == false){
            int frekans = 1;
            for (int j = i + 1; j < dizi.length; j++){
                if (dizi[i] == dizi[j]){
                    frekans++;
                    kontrol[j] = true;
                }
            }
            System.out.println(dizi[i] + " sayısı " + frekans + " kez tekrar edildi.");
            kontrol[i] = true;
        }
    }
    }
}