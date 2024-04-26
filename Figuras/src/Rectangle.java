public  class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int newWidht, int newHeight){
        setWidth(newWidht);
        setheight(newHeight);
    }
    
    public int getHeight() {
        return height;
    }

    public void setheight(int newHeight) {
       if (newHeight >= 0)
        height = newHeight;
    }

    public int getWidth(){
        return width;
    
    }

    public void setWidth (int newWidht){
        width=newWidht;
    }


    @Override
    public float getArea(){
        return width*height;
    }

    @Override
    public float getPerimeter(){
        return (2*(width+height));
    }

    
    
    

   



}
