package day1127;
// 五种方法获取一个 class 的 Class 实例
public class test1 {
    public static void main(String[] args) {

        Class cls=String.class;// class 是 String 类的一个静态变量

        String s = "Hello";
        Class cls2=s.getClass();// 调用类对象的 getClass 方法获取


        // 知道一个类的完整类名可以用 Class.forName 方法来获取
        try {
            Class cls3 = Class.forName("java.lang.String");
            System.out.println(cls3 == cls);// true
            System.out.println(cls3 == cls2);// true
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 对于基本数据类型，使用基本数据类型.class 获取
        Class cls4 = int.class;
        Class cls44 = char.class;

        // 对于基本数据类型对应包装类，.TYPE
        Class cls5 = Integer.TYPE;
        Class cls6 = Character.TYPE;

        System.out.println(cls4 == cls5);// true


    }
}
