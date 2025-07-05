package U_1.A_1;

public enum Studiengang {
    DSM(8),
    DEM(7),
    WIF(6),
    SYS_E(5),
    BWL(4);

    private int regelnstudientzeit;

    Studiengang(int regelnstudientzeit) {
        this.regelnstudientzeit = regelnstudientzeit;
    }

    public int getRegelnstudientzeit() {
        return regelnstudientzeit;
    }

    public void setRegelnstudientzeit(int regelnstudientzeit) {
        this.regelnstudientzeit = regelnstudientzeit;
    }
}
