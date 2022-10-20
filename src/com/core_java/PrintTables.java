package com.core_java;

import java.util.Scanner;

public class PrintTables 
{
	public static void main(String[] args) 
	{
		/*
		 * method :-1
		 * int num=2; for(int i=1;i<=10;i++) { System.out.println(num +" x "+ i +" = " +
		 * num*i); }
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Require Table Number :- ");
		int num=scan.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +" x "+ i +" = " + num*i);
		}
		
	}
}
