// 6510405792 Vimudakorn Kittechapanich
public class ChooseFlavorState implements State {
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
        gumballMachine.setState(gumballMachine.getGumballSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("please wait for gumball dispense");
//        gumballMachine.releaseBall();
//        if (gumballMachine.getCountGumballs() > 1) {
//            gumballMachine.setState(gumballMachine.getGumballSoldState());
//        } else {
//            gumballMachine.setState(gumballMachine.getOutOfGumballsState());
//        }
//        System.out.println("please select flavor");
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
