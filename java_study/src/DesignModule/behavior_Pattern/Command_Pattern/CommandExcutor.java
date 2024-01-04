package DesignModule.behavior_Pattern.Command_Pattern;

import java.util.HashMap;
import java.util.Map;

public class CommandExcutor {
    private Map<String,Command> commands = new HashMap<>();
    public CommandExcutor(){
        commands.put("create",new CreateFileCommand());
        commands.put("delete",new DeleteFileCommand());
    }
    public void excutorCommand(String commandName,String[] args){
        Command command = commands.get(commandName);
        if (command != null){
            command.excute(args);
        }else {
            System.out.println("Unknown Command"+commandName);
        }
    }
}
