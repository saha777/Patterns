package structural.bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        developer.writeCode();
    }
}
