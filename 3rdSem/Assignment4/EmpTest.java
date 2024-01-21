import java.util.Scanner;
class Employee{
	private String empName;
	private String empNo;
	private double basicSalary;
	public Employee(String name, String eno, double salary){
		empName=name;
		empNo=eno;
		basicSalary=salary;
	}
	public void showEmpDetails(){
		System.out.println("EMPLOYEE NO\tEMPLOYEE NAME\tBASIC SALARY");
		System.out.println(empNo+"\t"+empName+"\t"+basicSalary);
	}
}
public class EmpTest{
	public static void main(String[] args){
		int n;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter the no of employees: ");
		n=r.nextInt();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++){
			System.out.print("\nEnter Employee Name: ");
			String name=r.next();
			System.out.print("\nEnter Employee number: ");
			String eno=r.next();
			System.out.print("\nEnter Basic Salary: ");
			double salary=r.nextDouble();
			emp[i]=new Employee(name,eno,salary);
		}
		for(int i=0;i<n;i++){
			emp[i].showEmpDetails();
		}
	}
}
