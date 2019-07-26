package com.raphael;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //will print out s1 after formatting it, justifying to the left and adding 15 spaces, takes in type String (s1).
            System.out.printf("%-15s", s1);
            //will print out x after formatting it, padding it to add 0's to any number less than 3 digits, takes in type int (x).
            System.out.printf("%03d", x);
            System.out.println();
        }
        System.out.println("================================");

    }
}
