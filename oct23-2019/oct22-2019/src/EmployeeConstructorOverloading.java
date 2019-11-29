
public class EmployeeConstructorOverloading {
	String name;
	int eid;
	long adharno;

	EmployeeConstructorOverloading(String name,int eid,long adharno){
		this.name = name;
		this.eid = eid;
		this.adharno = adharno;
	}

	EmployeeConstructorOverloading(String name,int eid){
		this.name = name;
		this.eid = eid;
	}

	EmployeeConstructorOverloading(int eid,String name){
		this.name = name;
		this.eid = eid;
	}

	void printdetails() {
		System.out.println("employee name is "+name);
		System.out.println("employee eid is "+eid);

	}

	public static void main(String[] args) {
		EmployeeConstructorOverloading e = new EmployeeConstructorOverloading("divya",555);
		e.printdetails();
		
		EmployeeConstructorOverloading e1 = new EmployeeConstructorOverloading(455,"bavya");
		e1.printdetails();
		
		EmployeeConstructorOverloading e2 = new EmployeeConstructorOverloading("bheema",666,556666);
		e2.printdetails();

	}
}
