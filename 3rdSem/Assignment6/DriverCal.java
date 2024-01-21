interface Calculator{
    int add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class DemoCalculator implements Calculator{
    @Override
    public int add(int a,int b){
        return a+b;
    }
    @Override
    public int sub(int a,int b){
        return a-b;
    }
    @Override
    public int mul(int a,int b){
        return a*b;
    }
    @Override
    public int div(int a,int b){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("B must be greater than zero");
            return 0;
        }
    }

}
class DriverCal{
    public static void main(String[] args) {
        Calculator r=new DemoCalculator();
        int resultAdd=r.add(3,4);
        int resultSub=r.sub(4,3);
        int resultMul=r.mul(3,4);
        int resultDiv=r.div(10,5);
        System.out.print("\nAdd 3 and 4: "+resultAdd);
        System.out.print("\nSub 4 and 3: "+resultSub);
        System.out.print("\nMul 3 and 4: "+resultMul);
        System.out.print("\nDiv 10 and 5: "+resultDiv);
    }
}