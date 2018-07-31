package com.stackroute.excer;

import java.util.Scanner;

public class Sortp {
	public static void main(String[] args) {
	int n ,tem,sum=0;
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter no. of elements you want in array:");
     n = sc.nextInt();
     int a[] = new int[n];
     System.out.println("Enter all the elements:");
     for (int i = 0; i < n; i++) 
     {
         a[i] = sc.nextInt();
         if(a[i]%2==0) {
        	 sum+=a[i];
         }
     }
     for (int i = 0; i < n; i++) 
     {
         for (int j = i + 1; j < n; j++) 
         {
             if (a[i] < a[j]) 
             {
                 tem = a[i];
                 a[i] = a[j];
                 a[j] = tem;
             }
         }
     }
     if(sum<15) {
    	 System.out.println("true");
     }
     else {
    	 System.out.println("false");
     }
}
}
