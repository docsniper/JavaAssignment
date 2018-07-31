package com.stackroute.excer;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args)
	{
		System.out.println("enter a character");
		Scanner sc = new Scanner(System.in);
		 char gender = sc.next().charAt(0);
		 int ascii=(int) gender;
		 System.out.println("ascii value of char is:"+ascii);
		if(ascii>=65 && ascii<=90) {
			System.out.println("the char is upper case"+ascii);
		}
		else if(ascii>=97 && ascii<=122) {
			System.out.println("lower");
		}
		else if(ascii>=48 && ascii<=57) {
			System.out.println("Digit");
		}
		else if((ascii>=0 && ascii<=47) || (ascii>=58&& ascii<=64) || (ascii>=91 && ascii<=96) || (ascii>=123 && ascii<=127)) {
			System.out.println("Specil character");
		}

	}
}

