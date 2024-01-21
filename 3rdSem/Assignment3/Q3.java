import java.util.Scanner;
class Library{
	String bookName;
	int bookNo;
	int NoofPages;
	double price;
	String AuthorNames;
	void addBook(){
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter book name: ");
		bookName=obj.nextLine();
		System.out.print("\nEnter book no: ");
		bookNo=obj.nextInt();
		System.out.print("\nEnter no of pages: ");
		NoofPages=obj.nextInt();
		System.out.print("\nEnter the price: ");
		price=obj.nextDouble();
		obj.nextLine();
		System.out.print("\nEnter author name: ");
		AuthorNames=obj.nextLine();
	}
	void showBookInfo(){
		System.out.println("BOOK NO\tBOOK NAME\tPAGES\tPRICE\tAUTHOR");
		System.out.print(bookNo+"\t"+bookName+"\t"+NoofPages+"\t"+price+"\t"+AuthorNames+"\t");
	}
}
class Q3{
	public static void main(String[] args){
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the no of books: ");
		n=obj.nextInt();
		Library[] books=new Library [n];
		for(int i=0;i<n;i++){
			books[i]=new Library();
			books[i].addBook();
		}
		for(int i=0;i<n;i++){
			System.out.println("\nBook #" + (i + 1));
			books[i].showBookInfo();
		}
	}
}