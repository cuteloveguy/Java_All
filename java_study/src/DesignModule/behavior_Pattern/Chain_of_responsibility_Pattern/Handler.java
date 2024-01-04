package DesignModule.behavior_Pattern.Chain_of_responsibility_Pattern;

public interface Handler {
    Handler setNextHandler(Handler nextHandler);
    void HandlerRequest(Request request);

}
