public class MyPointClass {
    //implementation
    private double x;
    private double y;
    private double distance;

    private void calculateDistance(MyPointClass pointClass){

        System.out.println("x2: " + this.x);
        System.out.println("x1: " + pointClass.getX());

        System.out.println("y2: " + this.y);
        System.out.println("y1: " + pointClass.getY());

        distance = Math.sqrt(
                (this.x - pointClass.getX())
                        + (this.y - pointClass.getY())
        );

    }
    private void calculateDistance(double x1, double y1){

        System.out.println("x2: " + this.x);
        System.out.println("x1: " + x1);

        System.out.println("y2: " + this.y);
        System.out.println("y1: " + y1);

        distance = Math.sqrt(
                (this.x - x1) + (this.y - y1)
        );

    }

    //interface
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
    public double distance(double x1, double y1){
        calculateDistance(x1, y1);
        return distance;
    }
}
