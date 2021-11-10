package bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    protected void developProgram() {
        System.out.println("Stock exchange development is in progress...");
        developer.writeCode();
    }
}
