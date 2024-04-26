public  class Triangle extends Shape{

    /* private int[] sides = new int[]{0, 0, 0};

    public int  getSide1() {
        return sides[0];
    }
    public void setSide1(int newSize) {
        sides[0] = newSize;
    }
    public int  getSide2() {
        return sides[1];
    }
    public void setSide2(int newSize) {
        sides[1] = newSize;
    }
    public int  getSide3() {
        return sides[2];
    }
    public void setSide3(int newSize) {
        sides[2] = newSize;
    }
    @Override
    public float getArea() {
        return ((getSide1()+getSide2()+getSide3())/2);
    } */

    private int sideSize1 = 0;
    private int sideSize2 = 0;
    private int sideSize3 = 0;

    public int getSideSize1 (){
        return sideSize1;
    }
    public void setSideSize1 (int newSideSize){
        if (newSideSize>= 0)
            sideSize1 = newSideSize;
    }
    public int getSideSize2 (){
        return sideSize1;
    }
    public void setSideSize2 (int newSideSize2){
        if (newSideSize2>= 0)
            sideSize2 = newSideSize2;
    }
    public int getSideSize3 (){
        return sideSize3;
    }
    public void setSideSize3 (int newSideSize3){
        if (newSideSize3>= 0)
            sideSize3 = newSideSize3;
    }
    @Override
    public float getArea(){
        double semiperimetro= (getSideSize1() + getSideSize2() + getSideSize3()) / 2.0;
        return (int) Math.sqrt((semiperimetro * (semiperimetro - getSideSize1()) * (semiperimetro - getSideSize2()) * (semiperimetro - getSideSize3())));
    }

    @Override
    public float getPerimeter(){
        return (int) (getSideSize1() + getSideSize2() + getSideSize3());
    }

    public  Triangle (int newsideSize1,int newsideSize2, int newsideSize3){
        super();
        setSideSize1 (newsideSize1);
        setSideSize2(newsideSize2);
        setSideSize3(newsideSize3);


    }
    
}
