package com.simplilearn.basic;

import java.util.Scanner;

public class SimpleAdd2 {
	
	 public static void main(String[] args) {
		 
		 Scanner scanner=new Scanner(System.in);
		 int num1,num2;
		 System.out.println("Enter first number");
		 num1=scanner.nextInt();
		 System.out.println("Enter second number");
		 num2=scanner.nextInt();
		 
		 int result=num1+num2;
		 System.out.println("Result is" +result);
		 
		 
		 
	 }

}
