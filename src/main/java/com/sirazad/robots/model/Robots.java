package com.sirazad.robots.model;


public abstract class Robots {
    private final String NAME;
    protected final int CHARGE_MAX;
    protected final int CARRY_MAX;
    private int chargeLevel;
    int chargeNeed = 0;
    int carriedAmount = 0;


    public Robots(String name, int charge_max, int carry_max, int chargeLevel) {
        NAME = name;
        CHARGE_MAX = charge_max;
        CARRY_MAX = carry_max;
        this.chargeLevel = chargeLevel;
    }

    public void charge(int charge) {
        this.chargeLevel += charge;
        if ((chargeLevel) > CHARGE_MAX) chargeLevel = CHARGE_MAX;
    }

    public int getCarriedAmount(int storedGoods) {
        carriedAmount = Math.min(CARRY_MAX, storedGoods);
        this.getChargeNeed();

        while (chargeNeed > chargeLevel) {
            carriedAmount--;
            this.getChargeNeed();
        }
        this.chargeLevel -= chargeNeed;
        return carriedAmount;
    }

    private void getChargeNeed() {
        chargeNeed = carriedAmount/ getUNIT_PER_CHARGE();
    }

    protected int getUNIT_PER_CHARGE() {
        return 2;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" "+
                NAME + ", charges left: " + chargeLevel;
    }

    protected void decreaseChargeLevel(int chargeNeed) {
        chargeLevel = this.chargeLevel-chargeNeed;
    }
}
