
public class TestAOverride {
	
	public static void main(String[] args) {
		FatherOverride f = new FatherOverride();
		f.property();
		f.marry();
		System.out.println("********************************");
		
		SonOverride s = new SonOverride();
		s.marry();

	}
}
