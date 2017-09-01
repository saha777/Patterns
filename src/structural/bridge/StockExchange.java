package structural.bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        developer.writeCode();
    }
}
