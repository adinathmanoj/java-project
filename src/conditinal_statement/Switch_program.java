package conditinal_statement;

public class Switch_program {

	public static void main(String[] args) {
		int n=5;
		
		switch(n)
		{
		case 1:System.out.println("sunday");
		break;// to exit from switch block after meeting the condition
		
		case 2:System.out.println("monday");
		break;
		
		case 3:System.out.println("tuesday");
		break;
		
		case 4:System.out.println("wednesday");
		break;
		
		case 5:System.out.println("thursday");
		break;
		
		case 6:System.out.println("friday");
		break;
		
		case 7:System.out.println("saturday");
		break;
		
		default:System.out.println("invalid input");
		}
		

	}

}
