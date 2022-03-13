public class MyPointClass {
    //implementation
    private double x;
    private double y;
    private double distance;

    private void calculateDistance(MyPointClass pointClass){

        System.out.println("x2: " + pointClass.getX());
        System.out.println("x1: " + this.x);

        System.out.println("y2: " + pointClass.getY());
        System.out.println("y1: " + this.y);

        distance = Math.sqrt(
                ((pointClass.getX() - this.x) * (pointClass.getX() - this.x))  +
                        ((pointClass.getY() - this.y) * (pointClass.getY() - this.y))
        );

    }
    private void calculateDistance(double x2, double y2){

        System.out.println("x2: " + x2);
        System.out.println("x1: " + this.x);

        System.out.println("y2: " + y2);
        System.out.println("y1: " + this.y);

        distance = Math.sqrt(
                ((x2 - this.x) * (x2 - this.x))  +
                        ((y2 - this.y) * (y2 - this.y))
        );

    }

    //constructor
    public MyPointClass() {
        x = 0;
        y = 0;
    }
    //parameterized constructor
    public MyPointClass(double x, double y){
        this.x = x;
        this.y = y;
    }
    //copy constructor
    public MyPointClass(MyPointClass pointClass){
        this.x = pointClass.getX();
        this.y = pointClass.getY();
    }

    // interface

    //getters
    public double getX() {return x;}
    public double getY() {return y;}

    //setters
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}

    // method distance with parameter type MyPointClass
    public double distance(MyPointClass pointClass){
        calculateDistance(pointClass);
        return distance;
    }

    // method distance with parameter type coordinates
    public double distance(double x2, double y2){
        calculateDistance(x2, y2);
        return distance;
    }

    public static boolean isPolygon(int[] points){
        for(int p : points){
            if (p == points[points.length - 1]){
                return true;
            }
            else if(p != points[points.length -1]){
                return false;
            }
        }
        return false;
    }
}
