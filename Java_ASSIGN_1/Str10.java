package com.stackroute.excer;
import java.util.Scanner;


class Zap{
  void zin(String s, int n) {
    int l = s.length();
    if(l < n)
      return;
    int val = l - n;
    System.out.print(s);
    String [] str = s.split("");
    String st = "";
    for(int i = val;i < l;i++) {
      st += str[i];
    }
    while(n != 0) {
      System.out.print(st);
      n--;
    }
  }
}

public class Str10 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println("enter the string");
    System.out.println("enter the integer");
    int n = sc.nextInt();
    sc.close();
    Zap ob = new Zap();
    ob.zin(str, n);
  }
}
