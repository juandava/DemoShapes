public  class Square  extends Shape{

    private int width=0;
    

    public int getHeight() {
        return width;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int newWidth){
      if (newWidth >= 0)
      width = newWidth;  
      
    }
    public void setheight(int newHeight){
         
        setWidth(newHeight);
      }

    

    @Override
    public float getArea() {
      return getWidth()*getWidth();
    }

    @Override
    public float getPerimeter(){
      return (2*(getWidth())+(2*getHeight()));
    }

    public Square (int newWidht){
    
      setWidth(newWidht);
  }
  


  

}
