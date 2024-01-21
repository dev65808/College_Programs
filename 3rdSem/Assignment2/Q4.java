import java.util.Scanner;
class Q4{
	public static void main(String[] args){
		int i,j;
		Scanner obj=new Scanner(System.in);
		int a[][]=new int [3][3];
		int b[][]=new int [3][3];
		int c[][]=new int [3][3];
		System.out.println("Enter elements to the matrix1:");
		for(i=0;i<=2;i++){
			for(j=0;j<=2;j++){
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("Enter elements to the matrix2:");
		for(i=0;i<=2;i++){
			for(j=0;j<=2;j++){
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("\nMatrix1: ");
		for(i=0;i<=2;i++){
			for(j=0;j<=2;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("\nMatrix2: ");
		for(i=0;i<=2;i++){
			for(j=0;j<=2;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("\nArray after summation:");
		for(i=0;i<=2;i++){
			for(j=0;j<=2;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}