package day1120;

import java.io.Serializable;

public class Genric <T>{
    private T key;

    public Genric() {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public static <E> E show(E one){// 静态泛型方法
        return null;
    }

    public static <V> V add(V x,V y){
        return  y;
    }

    public static void main(String[] args) {
        int a=Genric.add(1,2);

        Object o= Genric.add(1, "asf");

        Number c=Genric.<Number>add(1,1.2);

    }
}


