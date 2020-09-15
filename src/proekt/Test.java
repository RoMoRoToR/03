package proekt;

public class Test {
    public static void main(String[] args){
        Shape a1 = new Circle(6.66, "Blue", true);
        System.out.println(a1);
        System.out.println(a1.getArea());
        System.out.println(a1.getPerimeter());
        System.out.println(a1.getColor());
        System.out.println(a1.isFilled());

        Circle b2 = (Circle) a1;
        System.out.println(b2);
        System.out.println(b2.getArea());
        System.out.println(b2.getPerimeter());
        System.out.println(b2.getColor());
        System.out.println(b2.isFilled());
        System.out.println(b2.getRadius());

        Shape c3 = new Rectangle(66.6, 6.66, "Grean", false);
        System.out.println(c3);
        System.out.println(c3.getArea());
        System.out.println(c3.getPerimeter());
        System.out.println(c3.getColor());

        Rectangle d4 = (Rectangle) c3;
        System.out.println(d4);
        System.out.println(d4.getArea());
        System.out.println(d4.getColor());
        System.out.println(d4.getLength());
        Shape s4 = new Square(6.66);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());


        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
