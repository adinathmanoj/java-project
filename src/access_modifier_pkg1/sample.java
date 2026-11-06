package access_modifier_pkg1;

public class sample {

	public static void main(String[] args) {
		Accessmodifierpgm obj=new Accessmodifierpgm();
		//System.out.println("private variable="+obj.a);//a is private variable so we cannot access
		System.out.println("default variable="+obj.b);
		System.out.println("protected variable="+obj.c);
		System.out.println("public variable="+obj.d);


	}

}
