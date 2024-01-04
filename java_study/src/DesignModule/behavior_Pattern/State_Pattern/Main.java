package DesignModule.behavior_Pattern.State_Pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State state1 = new ConcreteState1();
        State state2 = new ConcreteState2();
        context.setState(state1);
        context.request();
        context.setState(state2);
        context.request();

    }
}
