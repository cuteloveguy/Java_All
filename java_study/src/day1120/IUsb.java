package day1120;

public interface IUsb <U,R>{
    int a=10;
    // U name; 报错 属性默认静态

    R getU(U u);// 普通方法

    void hi(R r);// 抽象方法

    default R method(U u){
        return null;
    }









}
