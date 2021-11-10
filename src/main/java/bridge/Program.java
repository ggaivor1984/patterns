package bridge;

public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    protected abstract void developProgram();
}
