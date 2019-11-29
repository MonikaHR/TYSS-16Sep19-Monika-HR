
public class TestConstructor {

	TestConstructor(){
		System.out.println("TestConstructor");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestConstructor t = new TestConstructor();
		
		System.out.println("main ended");
	}
}
