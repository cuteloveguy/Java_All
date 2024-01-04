package DesignModule.struct_Pattern.Flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

class Circle implements Shape{
    private String color;
    private int radius;
    private int X;
    private int Y;

    public Circle(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    @Override
    public void draw() {
        System.out.println("绘制了一个圆，颜色为："+color+"，半径为："+radius+"，圆心位置X为："+X+"，Y为："+Y);
    }
}

class ShapeFactory{
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("创建了一个颜色为"+color+"的园");
        }
        return circle;
    }

}




public class Demo {
    private final static String[] Color = {"红色","绿色","蓝色","紫色","红色"};
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRadius());
            circle.draw();


        }
    }

    public static String getRandomColor(){
        return Color[(int) (Math.random()*Color.length)];
    }

    public static int getRandomX(){
        return (int) (Math.random()*100);
    }

    public static int getRandomY(){
        return (int) (Math.random()*100);
    }

    public static int getRadius(){
        return (int) (Math.random()*100);
    }
}


