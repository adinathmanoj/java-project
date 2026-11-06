package string_methods;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.println("enter a words");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int len=s.length()-1;
		//System.out.println(len);
		String r="";
		String temp=s;
		char value;
		for(int i=len;i>=0;i--) 
		{ 
		value=s.charAt(i);
		r=r+value;
		}
		System.out.println("rev is "+r);
		if(temp.equals(r))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
		

	}

}
