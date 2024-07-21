// 6510405792 Vimudakorn Kittechapanich
public class OutOfGumballsState implements State{
    GumballMachine gumballMachine;
    public OutOfGumballsState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter , the machine is sold out");
    }

//    I don't know what output should show in this case in eject and turn
    @Override
    public void ejectQuarter() {
        System.out.println("You turn, but you have no gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turn, but you have no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Oops, out of gumballs");
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("You can't select flavor , this machine has no gumballs");
    }
}
