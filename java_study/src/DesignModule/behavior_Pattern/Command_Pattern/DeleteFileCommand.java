package DesignModule.behavior_Pattern.Command_Pattern;

public class DeleteFileCommand implements Command{
    @Override
    public void excute(String[] args) {
        System.out.println("删除文件"+String.join(",",args));
    }
}
