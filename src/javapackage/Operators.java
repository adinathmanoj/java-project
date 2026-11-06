package javapackage;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic operators
		System.out.println("Arithemetic Operators");
		int a = 5;
		int b = 7;
		System.out.println("Addition = "+ (a+b));
		//System.out.println(a+b);
		System.out.println("Subtraction = "+ (a-b));
		System.out.println("Multiplication = "+ (a*b));
		System.out.println("Division = "+ (a/b));//Quotient value
		System.out.println("Modules = "+ (a%b));//Reminder value
		
		//Assignment Operators
		System.out.println("Assignment Operators");
		//a=b; values of b will be assigned to a
		System.out.println(a+=b);// a=a+b uodated value of a is 12
		System.out.println(a-=b);// a=a-b updated value of a is 12-7=5
		
		//Relational operators (the result of relation operator will be in boolean)
		System.out.println("Relational Operators");
		System.out.println("value of a = "+ a);
		System.out.println("value of b = "+ b);
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		
		//Logical Operators
		System.out.println("Logical Operators");
		String username ="abc";
		String password ="1234";
		System.out.println("AND");
		System.out.println(username == "abc" && password == "1234");
		System.out.println(username == "abc" || password == "1234566");
		System.out.println("OR");
		System.out.println(!(username == "abc"));


		


		
		

		

		



		
		

	}

}
