import java.util.Scanner;
class Q2{
	public static void main(String[] args){
		int size,i,j,temp;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		size=obj.nextInt();
		int a[]=new int [size];
		System.out.println("Enter the array elements: ");
		for (i=0;i<size;i++){
			a[i]=obj.nextInt();
		}
		System.out.print("Array elements are: ");
		for(i=0;i<size;i++){
			System.out.print(a[i]+" ");
		}
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("\nArray elements in desending order: ");
		for(i=0;i<size;i++){
			System.out.print(a[i]+" ");
		}
	}
}