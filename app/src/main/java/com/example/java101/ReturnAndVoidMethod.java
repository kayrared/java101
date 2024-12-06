package com.example.java101;

public class ReturnAndVoidMethod {


    static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    static void summ(int a, int b){
        int result = a + b;
        System.out.print(result);

    }



    public static void main(String args[]){

     System.out.println(sum(5,2) + sum(15, 15) + " " + sum(1,1));

     summ(5,2);



    }
}
