import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // array list for storing Geometric objects
        ArrayList<GeometricObject> objects = new ArrayList<>();

        // three objects of type circle
        Circle circle = new Circle(3);
        Circle circle1 = new Circle(4);
        Circle circle2 = new Circle(5);

        // two objects of type resizable circle
        ResizableCircle resizableCircle = new ResizableCircle(3);
        ResizableCircle resizableCircle1 = new ResizableCircle(4);

        // adding circles to main array
        objects.add(circle);
        objects.add(circle1);
        objects.add(circle2);

        // adding resizable circles to main array
        objects.add(resizableCircle);
        objects.add(resizableCircle1);

        // printing area and parameter of
        // all the elements in main array
        for(int i = 0; i < objects.size(); ++i){
            System.out.println(
                    (i + 1) + ". Area:" + objects.get(i).getArea());
            System.out.println(
                    "   Parameter:" + objects.get(i).getParameter());
        }

        // just a spacer
        System.out.println();

        // array list for managing objects separately
        ArrayList<Circle> circles = new ArrayList<>();
        ArrayList<ResizableCircle> resizableCircles = new ArrayList<>();

        // adding circles to circles array list
        for (GeometricObject g : objects) {
            if (g.getClass().getName().equals("Circle")) {
                circles.add((Circle) g);
            }
        }

        // adding Resizable circles to resizableCircles array list
        for (GeometricObject g : objects){
            if (g.getClass().getName().equals("ResizableCircle")) {
                resizableCircles.add((ResizableCircle) g);
            }
        }

        // just for verification if everything is in place
        for (Circle c : circles){
            System.out.println(c);
        }

        for (ResizableCircle rc : resizableCircles){
            System.out.println(rc);
        }

        // traversing and comparing areas
        for (int i = 0; i < resizableCircles.size(); ++i){
            for(ResizableCircle rc : resizableCircles){
                if(rc.radius == circles.get(i).radius){
                    System.out.println(rc.getArea());
                }
            }
        }


    }
}
