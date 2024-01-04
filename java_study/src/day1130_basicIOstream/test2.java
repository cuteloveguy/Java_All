package day1130_basicIOstream;

import java.io.Console;

public class test2 {
    public static void main(String[] args) {
        Console console = System.console();
        String name = console.readLine("请输入账号：");
        String password = console.readLine("请输入密码：");

        System.out.println("账号："+name+'\n'+"密码："+password+'\n');
    }
}
