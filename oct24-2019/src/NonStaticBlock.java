
public class NonStaticBlock {
	static int b;                  
	int a;
     
	{
		a = 10;
		b = 20;
		System.out.println("non static block 1");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		NonStaticBlock n = new NonStaticBlock();
		NonStaticBlock n1 = new NonStaticBlock();
		System.out.println("main ended");
	}

	{
		System.out.println("non static block 2");
	}
}
