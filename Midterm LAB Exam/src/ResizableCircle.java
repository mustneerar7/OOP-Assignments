public class ResizableCircle extends Circle{

    //constructor
    public ResizableCircle(double radius){
        super(radius);
    }

    public void resize(int percent){
        radius = radius * percent;
    }

    public String toString(){
        return "Resizable Circle";
    }

}
