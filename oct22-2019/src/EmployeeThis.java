
public class EmployeeThis {
	String name;
	int eid;
	public EmployeeThis(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to test yantra");
	}
	public static void main(String[] args) {
		EmployeeThis e1 = new EmployeeThis("rashmika",233);
		e1.printDetails();
		EmployeeThis e2 = new EmployeeThis("megha",454);
		e2.printDetails();
		EmployeeThis e3 = new EmployeeThis("manju",656);
		e3.printDetails();
	}
}
