package com.example.arrays;

public class MatrixTranspose {

    public static void main(String args[]){

        int[][] matris = {{1, 2}, {3, 4}, {5, 6}};  // 3x2
        int[][] Tmatris = {{1, 2, 3}, {4, 5, 6}};  // 2x3

        for (int i = 0; i < matris.length; i++){
            for (int j = 0; j < matris[i].length; j++){
                 matris[i][j] = Tmatris[j][i]  ;
            }
        }
        System.out.println("Matris: ");
        for (int i = 0; i < Tmatris.length; i++){
            for (int j = 0; j < Tmatris[i].length; j++){
                System.out.print(Tmatris[i][j] + " ");
            }
            System.out.println();
        }
















    }

}
