package DesignModule.behavior_Pattern.Command_Pattern;

public class Main {
    public static void main(String[] args) {
        CommandExcutor commandExcutor = new CommandExcutor();
        commandExcutor.excutorCommand("create",new String[]{"File.txt","Hello world"});
        commandExcutor.excutorCommand("delete",new String[]{"File.txt"});
        commandExcutor.excutorCommand("first",new String[]{});

    }
}
