package methods;

public class Method_types {

	public static void main(String[] args) {
		Method_types obj=new Method_types();
		
		int result=obj.add(2, 5);//store the value in result
		System.out.println("Addition:" +result);
		obj.sub();//calling method sub
		obj.multi(7, 5);//calling method multi and passing parameter
		int value=obj.div();//calling mathod div  and store the result to a variable
		System.out.println("Division:"+value);
		//System.out.println(obj.div());
		
	}
	//methods
	//method with parameter and return type
	public int add(int a,int b)
	{
		return a+b;//the value will be return to the main method
	}

//Method without parameter and without return type
	int x=15,y=5;
    public void sub()
    {
    	System.out.println("Substraction: " +(x-y));
    }
    
    //Method with parameter and without return type
    public void multi(int a,int b) {
    	System.out.println("Multiplication:"+(a*b));
    }
    
    //Methout without parameter and with return type
    public int div() {
    	return x/y;
    }
    
}