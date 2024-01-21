class Q6{
	public static void main(String[] args){
		int count=0;
		for(int i=37;i<=129;i++){
			int n=i;
			int a=2;
			int temp=0;
			while(a<=(n/2)){
				if(n%a==0){
					temp++;
					break;
				}
				a++;
			}
			if(temp==0){
				count++;
			}
		}
		System.out.print(count+" are prime numbers between 37 and 129");
	}
}