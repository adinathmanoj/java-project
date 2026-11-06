package access_modifier_pkg1;

public class Accessmodifierpgm {

	private int a=10;//private variable
	int b=2;//default variable
	protected int c=5;//protected variable
	public int d=14;//public
	
	
	
	public static void main(String[] args) {
		Accessmodifierpgm obj=new Accessmodifierpgm();
		System.out.println("private variable="+obj.a);
		System.out.println("default variable="+obj.b);
		System.out.println("protected variable="+obj.c);
		System.out.println("public variable="+obj.d);



		

	}

}
