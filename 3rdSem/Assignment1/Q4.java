import java.util.Scanner;
class Q4{
	public static void main(String[] args){
		int i,num;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=obj.nextInt();
		for(i=2;i<num;i++){
			if(num%i==0){
				System.out.println(num+" is a Composite number");
				break;
			}
			else{
				System.out.println(num+" is a Prime number");
				break;
			}
		}
	}
}
		