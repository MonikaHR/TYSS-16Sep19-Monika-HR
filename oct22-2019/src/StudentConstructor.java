
public class StudentConstructor {
	String name;
	int usn;
	String branch;
	String gender;
	String percentage;
	
	public StudentConstructor(String name,int usn,String branch,String gender,String percentage ) {
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.gender = gender;
		this.percentage = percentage;
	}
	
	public void display() {
		System.out.println("Student name is "+name);
		System.out.println("student usn is "+usn);
		System.out.println("branch is "+branch);
		System.out.println("gender is "+gender);
		System.out.println("percentage is "+percentage);
	}
	
	public static void main(String[] args) {
		StudentConstructor s = new StudentConstructor("megha",33,"ECE","female","70%");
		s.display();
		
		StudentConstructor s1 = new StudentConstructor("monika",36,"ECE","female","80%");
		s1.display();
		
		StudentConstructor s2 = new StudentConstructor("manju",30,"ME","male","69%");
		s2.display();
		
		StudentConstructor s3 = new StudentConstructor("deepak",41,"ME","male","66%");
		s3.display();
		
		StudentConstructor s4 = new StudentConstructor("kavya",55,"CSE","female","77%");
		s4.display();
		
		StudentConstructor s5 = new StudentConstructor("roopa",66,"ECE","female","60%");
		s5.display();
		
		StudentConstructor s6 = new StudentConstructor("lavanya",31,"CE","female","50%");
		s6.display();
		
		StudentConstructor s7 = new StudentConstructor("mahesh",63,"ISE","male","67.8%");
		s7.display();
		
		StudentConstructor s8 = new StudentConstructor("komal",54,"EEE","male","70%");
		s8.display();
		
		StudentConstructor s9 = new StudentConstructor("kavitha",79,"ECE","female","65.6%");
		s9.display();

	}
}
