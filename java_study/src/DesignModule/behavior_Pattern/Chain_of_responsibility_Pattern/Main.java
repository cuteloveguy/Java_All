package DesignModule.behavior_Pattern.Chain_of_responsibility_Pattern;

public class Main {
    public static void main(String[] args) {
        Handler Handler1 = new ConcreteHandler1();
        Handler Handler2 = new ConcreteHandler2();
        Handler Handler3 = new ConcreteHandler3();

        Handler1.setNextHandler(Handler2).setNextHandler(Handler3);

        Handler1.HandlerRequest(new Request("Type1"));
        Handler1.HandlerRequest(new Request("Type2"));
        Handler1.HandlerRequest(new Request("Type3"));



    }
}
