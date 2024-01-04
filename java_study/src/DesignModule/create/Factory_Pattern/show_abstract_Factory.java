package DesignModule.create.Factory_Pattern;

public class show_abstract_Factory {
    public static void main(String[] args) {
        animal dog = new dogFactory().create_Animal();
        dog.dothings();

        animal cat = new catFactory().create_Animal();
        cat.dothings();
    }
}

abstract class Animal_Factory{
    public abstract animal create_Animal();
}

class catFactory extends Animal_Factory{
    @Override
    public animal create_Animal() {
        return new Cat();
    }
}

class dogFactory extends Animal_Factory{
    @Override
    public animal create_Animal() {
        return new Dog();
    }
}


