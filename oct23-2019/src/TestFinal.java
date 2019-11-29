
public class TestFinal {
	public static void main(String[] args) {
		StudentFinal s1 = new StudentFinal();
		s1.printDetails();
		s1.PrintDetails("meghu");
		
		StudentFinal s = new StudentFinal("monika",123,354545);
		s.printDetails();
		s.PrintDetails("kavya");
	}
}
