
public class TestDefault {
	int a = 25;
	int x;
	public static void add() {
		//only final modifier is supported for local variable
		final int a;
		int b;
		a = 10;
		b = 15;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestDefault t = new TestDefault();
		System.out.println("x value is "+t.x);
	}
}
