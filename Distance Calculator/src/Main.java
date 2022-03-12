public class Main {

    public static void main(String[] args) {

        MyPointClass pointClass = new MyPointClass(10,30.5);
        MyPointClass pointClass1 = new MyPointClass(0, 0);

        // object created using copy constructor
        MyPointClass clonedPointClass = new MyPointClass(pointClass1);

        System.out.println(
                "Distance: "+ pointClass.distance(clonedPointClass)
        );

        System.out.println(
                "Distance para: " + pointClass.distance(0, 0)
        );
    }
}
