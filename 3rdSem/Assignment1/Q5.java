import java.util.Scanner;
class Q5{
	public static void main(String[] args){
		int i,M,N,sum=0,count=0;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the value of M: ");
		M=obj.nextInt();
		System.out.print("Enter the value of N: ");
		N=obj.nextInt();
		if(M<N){
			System.out.print("Numbers between " +M+ " and " +N+ " which is divisible by 3 and 5 are: ");
			for(i=M;i<=N;i++){
				if(i%3==0 && i%5==0){
					count++;
					sum+=i;
					System.out.print(i+" ");
				}
			}
			System.out.println("\n"+count+" numbers which are divisible by 3 and 5");
			System.out.println("Total addition of the numbers: "+sum);
		}
		else{
			System.out.println("ERROR N should be greater than M");
		}
	}
}