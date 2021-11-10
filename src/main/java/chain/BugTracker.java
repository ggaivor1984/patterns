package chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier SMSNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(SMSNotifier);

        reportNotifier.notifyManager(1,"Everything if ok");
        reportNotifier.notifyManager(2,"Something went wrong...");
        reportNotifier.notifyManager(3, "We crashed!");

    }
}
