
public class StudentFinal {
	String name;
	int rollno;
	final String cname = "Qspiders";
	final int cid;
	
	StudentFinal(){
		this.cid = 200;
	}

	StudentFinal(String name, int rollno, int cid){
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}

	final void printDetails() {
		System.out.println("Hi "+name+" Welcome to "+cname);
	}

	final void PrintDetails(String name) {
		System.out.println("Hi "+name+" Welcome to "+cname);
	}
}
