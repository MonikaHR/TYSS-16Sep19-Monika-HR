
public class EmployeeConstructor {
	String name;
	int eid;
	public EmployeeConstructor(String empname, int empid) {
		name = empname;
		eid = empid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}
	public static void main(String[] args) {
//		EmployeeConstructor e1 = new EmployeeConstructor();
//		e1.name = "Vani";
//		e1.eid = 143;
//		EmployeeConstructor e2 = new EmployeeConstructor();
//		e2.name = "megha";
//		e2.eid = 433;
//		EmployeeConstructor e3 = new EmployeeConstructor();
//		e3.name = "manju";
//		e3.eid = 666;
		EmployeeConstructor e1 = new EmployeeConstructor("rashmika",233);
		e1.printDetails();
		EmployeeConstructor e2 = new EmployeeConstructor("megha",454);
		e2.printDetails();
		EmployeeConstructor e3 = new EmployeeConstructor("manju",656);
		e3.printDetails();
	}
}
