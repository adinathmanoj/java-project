package access_modifier_pkg2;

import access_modifier_pkg1.Accessmodifierpgm;

public class Access2 extends Accessmodifierpgm {//access2 is the child class

	public static void main(String[] args) {
	Access2 obj=new Access2();
	//System.out.println("private variable="+obj.a);// a is a private variable it cannot access he
	//System.out.println("default variable="+obj.b);//b is a default variable
	System.out.println("protected variable="+obj.c);
	System.out.println("public variable="+obj.d);


	}

}
