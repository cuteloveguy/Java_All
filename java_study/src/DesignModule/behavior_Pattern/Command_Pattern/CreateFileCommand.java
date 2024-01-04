package DesignModule.behavior_Pattern.Command_Pattern;

public class CreateFileCommand implements Command {

    @Override
    public void excute(String[] args) {
        System.out.println("创建文件"+String.join(",",args));
    }
}

