abstract class GeometricFigure{
    double dim1=3.8;
    double dim2=5.9;
    abstract double getArea();
}
class Rectangle extends GeometricFigure{
    @Override
    public double getArea(){
        System.out.println("Area of rectangle:"+(dim1*dim2));
        return dim1*dim2;
    }
}
class Triangle extends GeometricFigure{
    @Override
    public double getArea(){
        System.out.println("Area of Triangle:"+(0.5*dim1*dim2));
        return 0.5*dim1*dim2;
    }
}
class GeoFig{
    public static void main(String[] args) {
        GeometricFigure r=new Triangle();
        GeometricFigure r1=new Rectangle();
        r1.getArea();
        r.getArea();
    }
}
