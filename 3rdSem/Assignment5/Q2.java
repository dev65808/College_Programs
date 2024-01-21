class Student {
    private String name;
    private int roll;

    Student(String name,int roll) {
        this.name=name;
        this.roll=roll;
    }

    void printStudent() {
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+roll);
    }
}

class Test extends Student {
    private double mark1;
    private double mark2;
    private double mark3;

    Test(String name,int roll,double mark1,double mark2,double mark3) {
        super(name,roll);
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    void printTest() {
        System.out.println("Mark1:"+mark1);
        System.out.println("Mark2:"+mark2);
        System.out.println("Mark3:"+mark3);
    }
}

class Result extends Test {
    private double total;

    Result(String name,int roll,double mark1, double mark2, double mark3) {
        super(name,roll,mark1,mark2,mark3);
        total=mark1+mark2+mark3;
    }

    void printResult() {
        System.out.println("Total:" + total);
    }
}

class Q2 {
    public static void main(String[] args) {
        Result r = new Result("Dev Jyoti",51,85.2,63.4,77.8);
        r.printStudent();
        r.printTest();
        r.printResult();
    }
}