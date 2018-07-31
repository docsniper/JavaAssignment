package com.stackroute.excer;

import java.util.Scanner;

public class Cond2 {
	public static void main(String []args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if (num%2!=0 && num>=20 && num<=30)
		{
			System.out.println("Tom");
		}
		else if (num%2==0 && num>=20 && num<=30)
		{
			System.out.println("Jerry");
		}
		else
				System.out.println("condition is false");
		}
	}



	
