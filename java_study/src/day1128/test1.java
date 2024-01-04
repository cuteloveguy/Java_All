package day1128;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test1 {
    public static void main(String[] args) throws NoSuchMethodException {
        String S = "Hello World";
        Method method = String.class.getMethod("substring", int.class, int.class);
        try {
            String s = (String) method.invoke(S, 2, 3);
            System.out.println(s);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
