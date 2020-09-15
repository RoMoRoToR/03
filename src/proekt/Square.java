package proekt;

public class Square extends Rectangle {
    private double side;

    public Square() {}
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        double side = 0;
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double side){}
    public void setLength(double side){}

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
