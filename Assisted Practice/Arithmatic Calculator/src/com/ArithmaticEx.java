package com;

public class ArithmaticEx 
{
	//Write a program to create Strings and display the conversion of String to StringBuffer and StringBuilder
		
		public static void main(String args[]) {
			
			String s = "Ipsita";
			StringBuffer sb = new StringBuffer(s);
			sb.append("Mishra");
			System.out.println(sb);
			
			String s1 = "Ambika";
			StringBuilder sb1 = new StringBuilder(s1);
			System.out.println(sb1);
		}
		

	}
	