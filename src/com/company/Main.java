package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner num = new Scanner(System.in);
        System.out.print("Pick a random integer:");
        int userNum = num.nextInt();
        int sum = 0;
        for (int i = 1; i<userNum+1;i++){
            sum = sum+i;
        }
        System.out.println("The sum from 1 to "+userNum+" is "+sum+".");
    }
}
