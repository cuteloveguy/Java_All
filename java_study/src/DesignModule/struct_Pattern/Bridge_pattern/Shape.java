package DesignModule.struct_Pattern.Bridge_pattern;

public abstract class Shape {
    protected Color color;
    public Shape(Color color){
        this.color = color;
    }

    public abstract void applyColor();
}
