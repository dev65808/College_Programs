class Q2{
	public static void main(String[] args){
		int a=5; int b=10;
		int add =a+b;
		int sub =a-b;
		int mul =a*b;
		int div =a/b;
		int mod =a%b;
		int bitwiseAND =a&b;
		int bitwiseOR =a|b;
		int bitwiseXOR =a^b;
		int bitwiseCompA =~a;
		int leftshift =a<<2;
		int rightshift =a>>2;
		System.out.println("Arithmetic Operators:");
		System.out.println("Addition: "+add);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+mul);
		System.out.println("Division: "+div);
		System.out.println("Modulus: "+mod);
		System.out.println("\nBitwise Operators:");
		System.out.println("Bitwise AND: "+bitwiseAND);
		System.out.println("Bitwise OR: "+bitwiseOR);
		System.out.println("Bitwise XOR: "+bitwiseXOR);
		System.out.println("Bitwise complement of A: "+bitwiseCompA);
		System.out.println("Left Shift: "+leftshift);
		System.out.println("Right SHift: "+rightshift);
	}
}