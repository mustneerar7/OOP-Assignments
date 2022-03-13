public class Main {

    public static void main(String[] args) {

        MyPointClass pointClass = new MyPointClass(0,0);
        MyPointClass pointClass1 = new MyPointClass(10, 30.5);

        // object created using copy constructor
        MyPointClass clonedPointClass = new MyPointClass(pointClass1);

        // calculation by passing an object
        System.out.println(
                "Distance: "+ pointClass.distance(clonedPointClass)
        );

        // calculation by passing (x,y) coordinates
        System.out.println(
                "Distance parameterized: " + pointClass.distance(10, 30.5)
        );

        // polygon checking function
        int[] points = new int[]{1,2,3,4,5,0};
        System.out.println(MyPointClass.isPolygon(points));
    }
}
