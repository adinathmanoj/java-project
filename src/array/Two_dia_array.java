package array;

import java.util.Scanner;

public class Two_dia_array {

	public static void main(String[] args) {
		//2x3 matrix
		//2 rows
		//3 columns
		int [][] ar=new int[2][3];
		Scanner sc=new Scanner(System.in);
	//	ar[0][0]=5;//0th row 0th column
	//	ar[0][1]=6;//0th row 1st column
	//	ar[0][2]=7;//0th row 2nd column
	//	ar[1][0]=3;//1st row 0th column
		
		System.out.println("Enter the values : ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("The values are : ");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)		
				{
					System.out.print(ar[i][j]);
				}	
			System.out.println();
		}



	}

}
