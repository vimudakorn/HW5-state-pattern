// 6510405792 Vimudakorn Kittechapanich
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        gumballMachine.insertQuarter();
        gumballMachine.choose("Mango");
        gumballMachine.choose("Orange");
        gumballMachine.turnCrank();

        gumballMachine.printDetail();
    }
}