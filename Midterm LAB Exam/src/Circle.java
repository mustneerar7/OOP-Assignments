public class Circle extends GeometricObject{
    protected double radius = 1.0;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getParameter(){
        return (2 * Math.PI * this.radius);
    }

    @Override
    public double getArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    public String toString(){
        return "Circle";
    }
}
