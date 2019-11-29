
public class StaticBlock {
	static int a;
	int b;
	static {
		a = 10;
		System.out.println("static block 1");
	}
	StaticBlock(){
		System.out.println("staticblock() constructor");
	}
	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();
		StaticBlock s1 = new StaticBlock();
		System.out.println("a value "+a);
	}
	static {
		a = 20;
		System.out.println("Static block 2");
	} 
	static {
		a = 40;
		System.out.println("Static block 3");
	}

}
