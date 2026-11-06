package inheritance_package;

class Animal {//parent class
	int a=5;
	public void animalmethod(){
		System.out.println("animalmethod");
	}		
}
class Dog extends Animal{//child class of animal
	public void dogmethod() {
		System.out.println("dog class methods");
	}
}
class Puppy extends Dog{//child class of dog
	public void Puppymethod() {
		System.out.println("puppy class methods");
	}
}

public class Multi_level {

	public static void main(String[] args) {
		Puppy obj=new Puppy();
		System.out.println("Value of a:"+obj.a);//calling parent class(animal) variable using child class object
		obj.animalmethod();//calling parent class method (animal) using child class object
		obj.dogmethod();//calling parent class method (dog) using child class object
		obj.Puppymethod();//calling parent class method (puppy) using child class object

	}

}
