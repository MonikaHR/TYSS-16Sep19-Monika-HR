
public class TestF {
 public static void main(String[] args) {
	Calculator c = new Calculator();
	c.add();
	c.subtract();
	
	System.out.println("**************************");
	SciCalculator sc = new SciCalculator();
	sc.add();
	sc.subtract();
	sc.sin();
	sc.cos();
}
}
