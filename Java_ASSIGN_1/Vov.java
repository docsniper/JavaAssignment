package com.stackroute.excer;
import java.util.Scanner;
public class Vov {
	public static void main(String[] args)
	{
		char a;
	System.out.println("enter word ");
	Scanner sc = new Scanner (System.in);
	String word=sc.next();
	int len=word.length();
	if(len==1)
	{
		a=word.charAt(0);
		if(a=='a' || a=='e' || a=='i'||a=='o'||a=='u')
		{
			System.out.println("vovel");
		}
		else
			System.out.println("consonent");
	}
	else {
		for(int i=0;i<len;i++)
		{
			a=word.charAt(i);
			if(a=='a' || a=='e' || a=='i'||a=='o'||a=='u')
			{
				System.out.println(a+ " -vovel");
			}
			else
			{System.out.println(a+ "-consonent");
		}
		
	}
	}
	}}
