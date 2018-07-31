package com.stackroute.excer;
import java.util.Scanner;

public class Itr {
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println(i);
			}
		}
	}
}