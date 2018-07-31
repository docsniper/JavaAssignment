package com.stackroute.excer;

import java.util.Random;
import java.util.Scanner;

public class Ran {

	public static void main(String []args) {
		Random rand = new Random();
		int nog=rand.nextInt(50);
		int tri =0;
		Scanner sc = new Scanner(System.in);
		int gss;
		boolean win =false;
		
		while(win == false) {
			System.out.println("guess the number");
			gss = sc.nextInt();
			tri++;
			if(gss == nog) {
			System.out.println("the number is correct");
			win=true;
		}
		else if(gss< nog) {
			System.out.println("the number is low");
			
		}
		else if(gss>nog) {
			System.out.println("the number is high");
		}
	}
}

}