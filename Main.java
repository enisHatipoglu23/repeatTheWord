package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here
    Scanner input  = new Scanner(System.in);
        System.out.println("Type a word: ");
    String word = input.nextLine();
        System.out.println("Pick a number for how many times you want to repeat word that you typed up.\nNum:");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.println(word);
        }

    }
}
