public class Circle extends Shape {
    
    private int radius =0;

    public Circle(int newRadius ){
        setRadius(newRadius);
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int newRadius){
        if (newRadius >= 0)
        radius= newRadius;
    }

    @Override
    public float getArea() {
       return (float)((getRadius()*getRadius())*Math.PI);
    }

    @Override
    public float getPerimeter() {
       return (float)(2*Math.PI*getRadius());
    }



    
}
