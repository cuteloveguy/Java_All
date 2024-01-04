package day1127;

import java.lang.reflect.Field;

public class test2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Field f = String.class.getDeclaredField("value");

        System.out.println(f.getName());
        System.out.println(f.getType());

        System.out.println(f.getModifiers());






    }
}
