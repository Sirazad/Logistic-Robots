public class Robots {
    private final String NAME;
    private final int CHARGE_MAX;
    private final int CARRY_MAX;
    private int chargeLevel;


    public Robots(String name, int charge_max, int carry_max, int chargeLevel) {
        NAME = name;
        CHARGE_MAX = charge_max;
        CARRY_MAX = carry_max;
        this.chargeLevel = chargeLevel;
    }


}
