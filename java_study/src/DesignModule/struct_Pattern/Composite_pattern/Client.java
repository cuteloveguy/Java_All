package DesignModule.struct_Pattern.Composite_pattern;

import java.util.ArrayList;
import java.util.List;

class Leaf implements IComponet{
    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Leaf" + name);
    }
}

abstract class Component implements IComponet{
    protected String name;

    public Component(String name){
        this.name = name;
    }

    abstract void add(IComponet componet);

    abstract void remove(IComponet componet);

}

class Composite extends Component{
    private List<IComponet> chilren = new ArrayList<IComponet>();

    public Composite(String name){
        super(name);
    }

    @Override
    void add(IComponet componet) {
        chilren.add(componet);
    }

    @Override
    void remove(IComponet componet) {
        chilren.remove(componet);
    }


    @Override
    public void display() {
        System.out.println("Composite" + name);
        for (IComponet iComponet : chilren) {
            iComponet.display();
        }

    }
}





public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");
        Component leftBranch = new Composite("leftbranch");
        Component rightBranch = new Composite("rightbranch");
        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");
        Leaf leaf3 = new Leaf("leaf3");

        root.add(leftBranch);
        root.add(rightBranch);
        leftBranch.add(leaf1);
        rightBranch.add(leaf2);
        rightBranch.add(leaf3);

        root.display();




    }
}
