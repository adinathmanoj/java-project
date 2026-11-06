package array;

import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your values :");
		int sum =0;
		int []a1=new int[3];
		for(int i=0;i<3;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("the array values are : ");
		for(int v:a1)
		{
			System.out.print(v+" ");
		}
		for(int i=0;i<3;i++)
		{
			sum=sum+a1[i];
		}
		System.out.println();
		System.out.println("The sum is : "+sum);
		

		
	}

}
