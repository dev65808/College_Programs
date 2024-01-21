import java.util.Scanner;
class Q1{
	public static void main(String[] args){
		int num,i,pos=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10];
		System.out.println("Enter the array elements:");
		for(i=0;i<10;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the number u want to search: ");
		num=sc.nextInt();
		for(i=0;i<10;i++){
			if(a[i]==num){
				pos=i;
				break;
			}
		}
		System.out.print(num+" found at "+pos+" position");
	}
}
