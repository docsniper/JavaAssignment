package com.stackroute.excer;

import java.util.Scanner;

public class RevStr {
		 
		public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter the string to be rev");
		String str=sc.nextLine();
		String revstring="";
		 
		for(int i=str.length()-1;i>=0;--i){
		revstring +=str.charAt(i);
		}
		 
		System.out.println(revstring);
		}
		}

