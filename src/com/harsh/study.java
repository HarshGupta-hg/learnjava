package com.harsh;

import java.util.Scanner;

public class study {
    public static void main(String[] args){
// To check number is even or odd
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }

}
