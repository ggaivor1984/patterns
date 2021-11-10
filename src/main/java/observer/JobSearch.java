package observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site = new JavaDeveloperJobSite();

        site.addVacancy("First Java Position");
        site.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Grigorii Gaivoronskii");
        Observer secondSubscriber = new Subscriber("Evgeni Petrov");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Third Java Position");

        site.removeVacancy("Second Java Position");


    }
}
