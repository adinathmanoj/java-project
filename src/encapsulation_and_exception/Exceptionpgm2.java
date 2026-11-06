package encapsulation_and_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm2 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		FileInputStream v=new FileInputStream("c://downloads//file.png");
	}

}
