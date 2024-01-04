package DesignModule.struct_Pattern.Bridge_pattern;

public class Red implements Color{

    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
