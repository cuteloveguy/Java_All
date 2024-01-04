package DesignModule.behavior_Pattern.Interpreter_Pattern;

public class Numberexpression implements Expression{
    private int value;
    public Numberexpression(int value){
        this.value = value;
    }
    @Override
    public int interpreter(Context context) {
        return  value;
    }
}
