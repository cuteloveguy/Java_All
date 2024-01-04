package DesignModule.create.Factory_Pattern;

public class showFactory {
    public static void main(String[] args) throws IllegalAccessException {
        animal dog = Factory.createAnimal("dog");
        dog.dothings();
        System.out.println();
        animal cat = Factory.createAnimal("cat");
        cat.dothings();
        System.out.println();


    }
}

abstract class animal{
    public abstract void dothings();
}

class Cat extends animal{
    @Override
    public void dothings() {
        System.out.println("喵喵喵");
    }
}

class Dog extends animal{
    @Override
    public void dothings() {
        System.out.println("汪汪汪");
    }
}

class Factory{

    public static animal createAnimal(String type) throws IllegalAccessException {
        if (type.equalsIgnoreCase("cat")){
            return new Cat();
        }else if(type.equalsIgnoreCase("dog")){
            return new Dog();
        }else {
            throw new IllegalAccessException("不合理的动物种类"+type);
        }
    }

}
