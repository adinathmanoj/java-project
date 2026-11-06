package conditinal_statement;

public class Nested_if {

	public static void main(String[] args) {
		int age=45, weight=43;
		if(age>=18) 
		{
			if(weight>=50)
			{
				System.out.println("Eligible");  // two conditions are true it prints eligible
			}
			else
			{
				System.out.println("under weight"); // if condition 2 is false, line prints
			}
			
			
		}
		else
		{
			System.out.println("not eligible"); //if condition 1 is false ,line prints
		}
		

	}

}
