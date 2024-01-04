package DesignModule.behavior_Pattern.State_Pattern;

public class ConcreteState1 implements State{
    @Override
    public void handle() {
        System.out.println("正在处理状态1");
    }
}
