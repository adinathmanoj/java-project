package encapsulation_and_exception;

public class Exceptionpgm {

	public static void main(String[] args) 
	{
		try
		{
		int a=10;
		int b=0;
		double c=a/b;
		System.out.println("value after division :"+c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hi");//execute  only after successfully complete 9 th line

	}

}
