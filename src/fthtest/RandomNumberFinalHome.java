package fthtest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberFinalHome {

    public static void main(String[] args) {
     
	Random rnum = new Random();

	int [] randomNumber = new int[500];
	for(int i = 0; i<500; i++) {
	    randomNumber[i]= rnum.nextInt(100000);
	    
	}
	 Arrays.sort(randomNumber);
	System.out.println(Arrays.toString(randomNumber));
         
	System.out.println("Give me a number between 1 to 500");
         Scanner ui = new Scanner(System.in);
        int input = ui.nextInt();
        System.out.println(randomNumber[input-1]);
}
}