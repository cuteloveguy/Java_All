package DesignModule.behavior_Pattern.Interpreter_Pattern;

public class AddExpression implements Expression{
    private Expression left;
    private Expression right;
    public AddExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context)+ right.interpreter(context);
    }
}
