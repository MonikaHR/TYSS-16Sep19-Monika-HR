
public class TestE {
 public static void main(String[] args) {
	Student.cname = "Qspiders";
	Student s = new Student();
	s.name = "monika gowda";
	s.rollno = 44;
	System.out.println("college name is "+Student.cname);
	System.out.println("name is "+s.name);
	System.out.println("rollno is "+s.rollno);
	
	Student s1 = new Student();
	s1.name = "Vani gowda";
	s1.rollno = 48;
	System.out.println("college name is "+Student.cname);
	System.out.println("name is "+s1.name);
	System.out.println("rollno is "+s1.rollno);
}
}
