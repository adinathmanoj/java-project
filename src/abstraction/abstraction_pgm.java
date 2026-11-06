package abstraction;

abstract class Parent{
	abstract public void display();//method without implementation
	public void normalmthd() {
		System.out.println("normal method");//its a normal method without implementation
	}
	
}
class Child extends Parent{

	@Override
	public void display() {//overrinding abstract class
		System.out.println("Abstract method");
	}
}
public class abstraction_pgm {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();// calling abstract method using child class object
		obj.normalmthd();//calling normal method using child class object

	}

}


	

