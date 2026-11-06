package inheritance_package;
class Mobile{
	public void mobilemethod() {
		System.out.println("Moble class");
	}
}
class Samsung extends Mobile{
	public void samsungmethod() {
		System.out.println("Samsung method");
	}
}
class Iphone extends Mobile{//inherit from class mobile
	public void iphonemethod() {
		System.out.println("Iphone method");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.mobilemethod();
		obj.samsungmethod();
		
		Iphone iphoneobj=new Iphone();
		iphoneobj.mobilemethod();
		iphoneobj.iphonemethod();
		

	}

}
