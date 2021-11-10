package chain;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(int level, String message){
        if(level>=priority){
            write(message);
        }
        if(nextNotifier!=null){
            nextNotifier.notifyManager(level,message);
        }
    }

    public abstract void write(String message);
}
