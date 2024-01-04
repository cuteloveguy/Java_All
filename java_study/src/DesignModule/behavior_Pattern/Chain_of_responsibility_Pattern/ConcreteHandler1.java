package DesignModule.behavior_Pattern.Chain_of_responsibility_Pattern;

public class ConcreteHandler1 extends AbstarctHandler{

    @Override
    public void HandlerRequest(Request request) {
        if (request.getType().equals("Type1")){
            System.out.println("具体 Concrete1 的实现"+request);
        }else {
            getNextHandler().HandlerRequest(request);
        }
    }
}
