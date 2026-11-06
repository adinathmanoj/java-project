package encapsulation_and_exception;

class Employee {
	 private int id=5;
	 private String name="vismaya";
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 } 
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee obj=new Employee();
		//System.out.println("value of id:"+obj.id); //id is a private variable so can't call from another class
		System.out.println("value of id:"+obj.getId()); //accessing private variable with a help of 
		obj.setId(10);
		System.out.println("value of id after updation:"+obj.getId());
		System.out.println("Name:"+obj.getName());
		obj.setName("sudu");
		System.out.println("Updated Name:"+obj.getName());
	}

}


	
