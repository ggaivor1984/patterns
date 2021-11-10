package singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addInfo("First log...");
        ProgramLogger.getProgramLogger().addInfo("Second log...");
        ProgramLogger.getProgramLogger().addInfo("Third log...");
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());


ProgramLogger.getProgramLogger().showLogFile();
    }
}
