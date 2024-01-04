package DesignModule.struct_Pattern.Decorator_pattern;

class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "饼";
    }

    @Override
    public double getCost() {
        return 4;
    }
}

abstract class ToppingDecorator implements Pizza{
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription();
    }

    public double getCost(){
        return pizza.getCost();
    }

}


class First extends ToppingDecorator{


    public First(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"香肠";
    }

    @Override
    public double getCost() {
        return super.getCost()+2;
    }
}


class Second extends ToppingDecorator{

    public Second(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"芝士";
    }

    @Override
    public double getCost() {
        return super.getCost()+1;
    }
}




public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PlainPizza();
        pizza = new Second(pizza);
        pizza = new First(pizza);

        System.out.println(pizza.getDescription());
        System.out.println("价钱:"+pizza.getCost());



    }


}
