
public class TestB {
	public static void main(String[] args) {
		Cow c = new Cow();

		c.name = "ganga";
		c.color = "pink";
		System.out.println("name of cow is "+c.name);
		System.out.println("color of cow "+c.color);
		c.eat();
		c.sleep();

		System.out.println("********************************");
		Cow c1 =  new Cow();
		c1.name = "tunga";
		c1.color = "white";
		System.out.println("cow name is "+c1.name);
		System.out.println("cow color is "+c1.color);
		c1.eat();
		c1.sleep();		
	}

}
