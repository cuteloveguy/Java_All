package DesignModule.behavior_Pattern.Chain_of_responsibility_Pattern;

public abstract class AbstarctHandler implements Handler{
    private Handler nextHandler;

    @Override
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }

    public Handler getNextHandler(){
        return nextHandler;
    }
}
