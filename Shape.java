public  abstract class Shape {
    private int x=0;
    private int y=0;
    

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int newX) {
        if (newX >= 0 && newX <= 1000) {
        x=newX;
    }

    } 
    public void setY(int newY) {
        if (newY >= 0 && newY <= 1000) {
            y=newY; 
        }
       
        
    }  

    abstract public float getArea();
    abstract public float getPerimeter();
}
