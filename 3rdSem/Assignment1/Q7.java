import java.util.Scanner;
class Q7{
	public static void main(String[] args){
		double x;
		int n;
		double sum=1.0;
		double term=1.0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		x=obj.nextDouble();
		System.out.print("Enter the no. of terms: ");
		n=obj.nextInt();
		for(int i=1;i<n;i++){
			term*=x/i;
			sum+=term;
		}
		System.out.print("The sum of the series is: "+sum);
	}
}