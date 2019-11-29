
public class TestC {
	public static void main(String[] args) {
       Person.color = "white";
       Person.sleep();
       System.out.println("person color "+Person.color);
       
       System.out.println("**********************************");
       Person p = new Person();
       p.age = 22;
       p.name = "monika";
       System.out.println("person age "+p.age);
       System.out.println("person name "+p.name);
      
       
       Person p1 = new Person();
       p1.name = "kavya";
       p1.age = 22;
      System.out.println("name is"+p1.name);
      System.out.println("age is"+p1.age);
       }

}
