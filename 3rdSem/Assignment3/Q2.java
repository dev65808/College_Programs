import java.util.Scanner;
class Employee{
	String empName;
	int empNo;
	double basicSal;
	double da;
	double hra;
	double grossSal;
	void inputEmpDetails(){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the Employee Name: ");
		empName=obj.nextLine();
		System.out.print("\nEnter the Employee Number: ");
		empNo=obj.nextInt();
		System.out.print("\nEnter the basic salary: ");
		basicSal=obj.nextDouble();
		System.out.print("\nEnter the da: ");
		da=obj.nextDouble();
		System.out.print("\nEnter the hra: ");
		hra=obj.nextDouble();
	}
	void calGrossSal(){
		da=(20.0/100.0)*basicSal;
		hra=(10.0/100.0)*basicSal;
		grossSal=basicSal+da+hra;
	}
	void showEmpDetails(){
		System.out.println("\nNAME\t\tEMPNO\t\tBASIC\t\tDA\t\tHRA\t\tGROSS");
		System.out.println(empName+"\t\t"+empNo+"\t\t"+basicSal+"\t\t"+da+"\t\t"+hra+"\t\t"+grossSal+"\t\t");
	}
}
class Q2{
	public static void main(String[] args){
		Employee r=new Employee();
		r.inputEmpDetails();
		r.calGrossSal();
		r.showEmpDetails();
	}
}