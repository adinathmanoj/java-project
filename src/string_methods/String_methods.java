package string_methods;

public class String_methods {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3 =new String ("Hello");
//		if(s2==s3)//output will false because == compare the reference numbers not the values
//		{
//			System.out.println("Values are equal");
//		}
//		else
//		{
//			System.out.println("value are not equal");
//		}
		//equals()
		if(s2.equals(s3))
		{
			System.out.println("Values are equal");
		}
		else
		{ 
			System.out.println("value are not equal");
		}
		
		//equalsIgnoreCase()
		if(s2.equalsIgnoreCase(s3)) 
		{
			System.out.println("Values are equal");
		}
		else
		{
			System.out.println("value are not equal");
		}
			
		//concat()
		String s4="World";
		System.out.println(s1.concat(s4)); //Helloworld
	
		//contains()
		System.out.println(s4.contains("Wo"));
	
		//toUpperCase()
		System.out.println(s1.toUpperCase());//HELLO
	
		//toLowerCase()
		System.out.println(s1.toLowerCase()); //hello
	
		//length()
		System.out.println(s1.length()); //5
		
		//trim()- removes the white space from starting and end
		String s5=" hello ";
		System.out.println("before trim"+s5);
		System.out.println("after trim :"+s5.trim());
		
		//startsWith()-to start with a specific word
		String s6="hello everyone good morning";
		System.out.println(s6.startsWith("hello"));
		System.out.println(s6.endsWith("mornging"));
		
		//charAt(index position)
		System.out.println(s6.charAt(2));//to retrieve the letter at a specific index position
		
		//substring(start index,end index)
		System.out.println(s6.substring(0,12));//end not print the value at end index
		
		//split()-to split a sentence based up on a condition
		String [] result = s6.split(" ");
		System.out.println("--The result after spilt--");
		for (String v:result)
		{
			System.out.println(v);
		}
		
		System.out.println("the number of words= "+result.length);//to find the number of words in a sentence
		
		//toCharArray()-to retrieve as single character from the string
		String s7="adinath manoj";
		char [] ar =s7.toCharArray();
		System.out.println("--Result of charArray--");
		for(char c:ar)
		{
			System.out.println(c);
		}
		//replace()-to replace specific word from a sentence
		System.out.println(s6.replace("hello", "hi"));

		
	}

}

