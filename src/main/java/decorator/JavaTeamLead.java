package decorator;

public class JavaTeamLead extends DeveloperDecorator{
    JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String makeWeekReport(){
        return "Make week report to customer...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + " " + this.makeWeekReport();
    }
}
