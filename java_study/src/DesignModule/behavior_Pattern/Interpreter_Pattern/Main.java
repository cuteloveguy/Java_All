package DesignModule.behavior_Pattern.Interpreter_Pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setVariables("a",10);
        context.setVariables("b",20);
        Expression expression = new AddExpression(new Numberexpression(context.getVariables("a")),new Numberexpression(context.getVariables("b")));

        Interpreter interpreter = new Interpreter(expression);
        int result = interpreter.interpret(context);
        System.out.println(result);
    }
}
