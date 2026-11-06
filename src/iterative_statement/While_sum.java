package iterative_statement;

public class While_sum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10)
		{
			//System.out.println(i);
			sum=sum+i;//sum=0+1=1, sum=1+2=3,sum=3+3=6.... upto 10
			i++;
		}
		System.out.println("sum = " +sum);
	}
	

}
