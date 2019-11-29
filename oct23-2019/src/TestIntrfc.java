
public class TestIntrfc {
 public static void main(String[] args) {
	AutoMobileIntrfc a;
	BMW b = new BMW();
	b.gear();
	b.gps();
	b.abs();
	System.out.println("**********");
	
	Toyoto t = new Toyoto();
	t.gear();
	t.gps();
}
}

