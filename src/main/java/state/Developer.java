package state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            this.setActivity(new Training());
        } else if (activity instanceof Training) {
            this.setActivity(new Coding());
        } else if (activity instanceof Coding) {
            this.setActivity(new Reading());
        } else if (activity instanceof Reading) {
            this.setActivity(new Sleeping());
        }

    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
