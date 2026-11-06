package string_methods;

public class Length {

	public static void main(String[] args) {
		String s2="Java is simple and easy to learn";
		String [] ar = s2.split(" ");
		for (String v:ar)
		{
			System.out.println(v);
		}
		System.out.println("the number of words= "+ar.length);
		int  len=ar.length-1;
		String rev="";
		for(int i=len;i>=0;i--)
		{
			rev=rev+ar[i]+" ";	
		}
		System.out.println();
		System.out.print("reversed sentence: ");
		System.out.println(rev);
			
		


	}

}
