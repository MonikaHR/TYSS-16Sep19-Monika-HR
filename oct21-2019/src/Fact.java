
public class Fact {
	static int fact(int n)
	{
		if(n == 0)
		return 1; 
		else
			return (n * fact(n-1));
		
	}
	public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
		fact = fact(num);
		System.out.println("factorial of a number is "+fact);
		
		
	}

}
