package DesignModule.behavior_Pattern.Interpreter_Pattern;

public class Interpreter {
    private Expression expression;
    public Interpreter(Expression expression){
        this.expression = expression;

    }
    public int interpret(Context context){
        return expression.interpreter(context);
    }
}
