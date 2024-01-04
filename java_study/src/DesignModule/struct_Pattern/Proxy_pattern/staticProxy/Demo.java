package DesignModule.struct_Pattern.Proxy_pattern.staticProxy;

class Helloimp implements IHello{


    @Override
    public String hi(String key) {
        String str = "hello"+key;
        System.out.println("Helloimp"+str);
        return str;
    }
}


class HelloStaticProxy implements IHello{

    public IHello iHello;

    public HelloStaticProxy(IHello iHello){
        this.iHello = iHello;
    }


    @Override
    public String hi(String key) {
        System.out.println("代理开始");
        String result = iHello.hi(key);
        System.out.println("代理结束");
        return result;
    }
}



public class Demo {
    public static void main(String[] args) {
        IHello helloproxy = new HelloStaticProxy(new Helloimp());
        helloproxy.hi("word");
    }

}
