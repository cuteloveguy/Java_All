package DesignModule.struct_Pattern.Bridge_pattern;

public class Main {
    public static void main(String[] args) {
        Blue blue = new Blue();
        Square square = new Square(new Red());
        Circle circle = new Circle(blue);
        square.applyColor();
        circle.applyColor();
    }
}
