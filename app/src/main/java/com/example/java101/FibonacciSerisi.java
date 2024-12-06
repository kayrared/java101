package com.example.java101;

public class FibonacciSerisi {


    static int f(int x){
              if (x == 1 || x == 2){
                  return 1;
              }

        return f(x - 1) + f(x - 2);
    }
    public static void main(String args[]){

System.out.print(f(10));

    }
}
