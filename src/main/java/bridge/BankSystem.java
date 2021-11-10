package bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Bank system development is in progress...");
        developer.writeCode();
    }
}
