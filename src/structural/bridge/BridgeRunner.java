package structural.bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Program program = new BankSystem(new JavaDeveloper());
        program.developProgram();
        program = new StockExchange(new CppDeveloper());
        program.developProgram();
    }
}
