
public class TestOverride {
	public static void main(String[] args) {
		SuperclassOverride s = new SuperclassOverride();
		s.count();
		System.out.println("**************************");
		SubclassOverride s1 = new SubclassOverride();
		s1.count();
		s1.add();
	}
}
