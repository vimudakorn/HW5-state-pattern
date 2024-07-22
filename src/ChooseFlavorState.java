import java.util.Random;

// 6510405792 Vimudakorn Kittechapanich
public class ChooseFlavorState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;
    public ChooseFlavorState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert quarter , please select flavor");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned...");
        gumballMachine.setState(gumballMachine.noQuarterState);
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCountGumballs() > 1)) {
            gumballMachine.setState(gumballMachine.winnerState);
        } else {
            gumballMachine.setState(gumballMachine.gumballSoldState);
        }
    }

    @Override
    public void dispense() {
        System.out.println("please wait for gumball dispense");
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
