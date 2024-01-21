import java.util.Scanner;
class Number{
	int num,a;
	int fact=1,i;
	int sum=0;
	int firstDigit,midDigit,lastDigit;
	int revNum=0;
	void setNum(){
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter any number: ");
		num=obj.nextInt();
	}
	void displayNum(){
		System.out.print("\nNumber is: "+num);
	}
	void factorial(){
		for(i=1;i<=num;i++){
			fact*=i;
		}
		System.out.print("\nFactorial of "+num+" is: "+fact);
	}
	void isPrime(){
		int flag=0;
		for(i=2;i<=num/2;i++){
			if(num%i==0){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.print("\n"+num+" is not a prime number");
		}	
		else{
			System.out.print("\n"+num+" is not a prime number");
		}
	}
	void sumOfDigit(){
		lastDigit=num%10;
		a=num/10;
		firstDigit=a/10;
		midDigit=a%10;
		sum=firstDigit+midDigit+lastDigit;
		System.out.print("\nSum of "+num+" : "+sum);
	}
	void reverseNum(){
		int n=num;
		while(n>0){
			revNum=revNum*10+n%10;
			n=n/10;
		}
		System.out.print("\nReverse of "+num+" is: "+revNum);
	}
}
class Q1{
	public static void main(String[] args){
		Number r=new Number();
		r.setNum();
		r.displayNum();
		r.factorial();
		r.isPrime();
		r.sumOfDigit();
		r.reverseNum();
	}
}
