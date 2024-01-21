import java.util.Scanner;
class Account{
	private int accNo;
	private float balance;
	private float timePeriod;
	private static float intInYears=7.5f;
	Account(int acNo,float bal,float time){
		accNo=acNo;
		balance=bal;
		timePeriod=time;
	}
	float calculateInterest(){
		return (balance*intInYears*timePeriod)/100;
	}
	void showAccDetails(){
		float interest=calculateInterest();
		System.out.println("ACCOUNT NO\tBALANCE\tINTEREST");
		System.out.println(accNo+"\t"+balance+"\t"+interest);
	}
	static void changeIntRate(float newRate){
		intInYears=newRate;
		System.out.print("Interest rate changed to: "+intInYears);
	}
}
class Q2{
	public static void main(String[] args){
		int n;
		Scanner r=new Scanner(System.in);
		System.out.print("\nEnter the no of accounts: ");
		n=r.nextInt();
		Account[] acc=new Account[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter account no: ");
			int acNo=r.nextInt();
			System.out.print("Enter balance: ");
			float bal=r.nextFloat();
			System.out.print("Enter time period: ");
			float time=r.nextFloat();
			acc[i]=new Account(acNo,bal,time);
		}
		System.out.println("Account Details before changing the interest rate:");
		for(int i=0;i<n;i++){
			acc[i].showAccDetails();
		}
		Account.changeIntRate(8.0f);
		System.out.println("\nAccount Details after changing the interest rate:");
		for(int i=0;i<n;i++){
			acc[i].showAccDetails();
		}
	}
}