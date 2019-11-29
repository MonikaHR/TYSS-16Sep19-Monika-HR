package co.testyantra.exception.second;

public class TestA {
   public static void main(String[] args) {
	   System.out.println("main strted");
	   
	try {
		Thread.sleep(3000);
		System.out.println("inside try");
	}
	catch(InterruptedException ie) {
		System.out.println("exception occured");
	  ie.printStackTrace();
	}
	
	System.out.println("main ended");
   }
}
