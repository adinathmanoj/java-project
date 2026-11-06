package array;

import java.util.Scanner;

public class String_array {

	public static void main(String[] args) {
		String ar[]= new String[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your values :");
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("the array values are : ");
//		for(int i=0;i<3;i++)
		//{
			//System.out.println(ar[i]+" ");
		//}
		for(String v:ar)
		{
			System.out.println(v+" ");
		}

	}

}
