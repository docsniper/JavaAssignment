package com.stackroute.excer;
import java.util.*;
public class Palin {
	public static void main(String []args) {
		int r,sum=0,even=0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		temp=n;
		while (n>0) {
			r=n%10;
			if(r%2==0) {
				even +=r;}
			else
				continue;
			sum=(sum*10)+r;
			n=n/10;

			}
		if(temp == sum) {
			System.out.println("the number is palin");
			System.out.println("sum of even is : " +even);
		}
		else
			System.out.println("the number is not palin");
	}

}
