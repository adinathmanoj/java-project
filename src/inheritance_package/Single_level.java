package inheritance_package;

class Parent{
	int a=5;
	public void parentmethod() {
		System.out.println("parentmethod");
	}
}

class Child extends Parent{
	public void childmethod() {
		System.out.println("childmethod");
	}
}

public class Single_level {

	public static void main(String[] args) {
		Child obj=new Child();
		System.out.println("Value of a:"+obj.a);//calling parent class variable using child class object
		obj.parentmethod();
		obj.childmethod();

	}

}
