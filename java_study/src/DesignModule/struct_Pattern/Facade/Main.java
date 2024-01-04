package DesignModule.struct_Pattern.Facade;

class CPU{
    public void processData(){
        System.out.println("正在启动CPU");
    }
}

class Memory{
    public void load(){
        System.out.println("正在读取内存");
    }
}

class HardDrive{
    public void readData(){
        System.out.println("正在读取数据");
    }
}

class ComputerFacade{
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(){
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start(){
        System.out.println("正在启动电脑");
        cpu.processData();
        memory.load();
        hardDrive.readData();
        System.out.println("计算机启动完毕");

    }
}

public class Main {
    public static void main(String[] args) {

        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();

    }
}
