
public class SubClass extends SuperClass{
     String s = "subclass variable";
	SubClass(){
    	   
    	   System.out.println("subclass constructor");
       }
	void getsData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
	}
}
