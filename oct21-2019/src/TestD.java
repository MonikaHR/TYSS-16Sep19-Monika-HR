

public class TestD {
public static void main(String[] args) {
	BTM b = new BTM();
	b.swipe();
	 int count = b.getcount();
	 System.out.println("count is "+count);
	int totalcount = b.gettotalcount();
	System.out.println("totalcount is "+totalcount);
	
	BTM b1 = new BTM();
	b1.swipe();
	int count1 = b.getcount();
	 System.out.println("count is "+count1);
	int totalcount1 = b.gettotalcount();
	System.out.println("totalcount is "+totalcount1);
	
}
}
