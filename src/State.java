// 6510405792 Vimudakorn Kittechapanich
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void chooseFlavor(String flavor);
}
