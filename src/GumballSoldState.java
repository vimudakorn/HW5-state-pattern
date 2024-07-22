// 6510405792 Vimudakorn Kittechapanich
public class GumballSoldState implements State {
    GumballMachine gumballMachine;
    public GumballSoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCountGumballs() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getOutOfGumballsState());
        }
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("You have already gumballs");
    }
}
