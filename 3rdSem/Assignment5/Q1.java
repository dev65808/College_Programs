import java.util.Scanner;
class Employee{
	private String empName;
	private int empID;
	public Employee(){
	}
	public Employee(String empName,int empID){
		this.empName=empName;
		this.empID=empID;
	}
	public void inputData(){
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		empName=r.next();
		System.out.println("Enter Employee ID:");
		empID=r.nextInt();
		r.close();
	}
	public void displayData(){
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee ID: "+empID);
	}
}
class Manager extends Employee{
	private double basicSalary;
	private byte DA;
	private byte HRA;
	Manager(){
	}
	public Manager(double basicSalary,byte DA,byte HRA){
		this.basicSalary=basicSalary;
		this.DA=DA;
		this.HRA=HRA;
	}
	void getInfo(){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		basicSalary=obj.nextDouble();
		obj.close();
	}
	byte calSal(){
		DA=(byte) ((20/100)*basicSalary);
		HRA=(byte) ((10/100)*basicSalary);
		return (byte) (DA+HRA+basicSalary);
	}
	void printInfo(){
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("DA: "+DA);
		System.out.println("HRA: "+HRA);
		System.out.println("SALARY: "+calSal());
	}
}
class Q1{
	public static void main(String[] args){
		Manager sc=new Manager();
		sc.inputData();
		sc.getInfo();
		sc.calSal();
		sc.displayData();
		sc.printInfo();
	}
}
		
