package day1127;

import java.lang.reflect.Field;

public class test3 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("AAA");
        Class cls = p.getClass();
        Field f = cls.getDeclaredField("Name");
        f.setAccessible(true);
        Object o = f.get(p);
        System.out.println(o);
        f.set(p,"BBB");
        System.out.println(f.get(p));


    }
}

class Person{

    private String Name;

    public Person(String Name){
        this.Name=Name;
    }


}
