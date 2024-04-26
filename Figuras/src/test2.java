public class test2 extends Terminal {
    public static void main(String[] args) {
        var shapes = new Shape[]{

            new Square(5),
            new Square(7),
            new Square(10),
            new Rectangle (6, 4),
            new Rectangle (8, 2),
            new Rectangle (9, 3),
            new Circle (3),
            new Circle (4),
            new Circle (5),
            new Elipse (5, 3),
            new Elipse (6, 2),
            new Elipse (7, 4),
            new Triangle (3,4,5),
            new Triangle(7,8,10 ),
            new Triangle(6,7,8 ),

    };
    
        float areaTotal=0, perimTotal=0;

        for(Shape shape: shapes){
    
            areaTotal = shape.getArea();
            perimTotal = shape.getPerimeter();
            printLine("area total=%.2f, perimetro total = %.2f", areaTotal, perimTotal );
        }
        printLine("area total=%.2f, perimetro total = %.2f", areaTotal, perimTotal );
    }
}
