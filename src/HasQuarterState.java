// 6510405792 Vimudakorn Kittechapanich
import java.util.Random;

public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned , but please select the flavor before");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void chooseFlavor(String flavor) {
        if (flavor.equals("Mango") || flavor.equals("Orange")) {
            System.out.println("You have chosen the flavor " + flavor);
            gumballMachine.setState(gumballMachine.chooseFlavorstate);
            gumballMachine.setFlavor(flavor);
        }
    }
}
