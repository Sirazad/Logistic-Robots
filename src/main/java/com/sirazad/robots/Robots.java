package com.sirazad.robots;


public abstract class Robots {
    private final String NAME;
    protected final int CHARGE_MAX;
    protected final int CARRY_MAX;
    private int chargeLevel;
    private int unitPerCharge = 2;
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

    private int getChargeNeed() {
        chargeNeed = carriedAmount/getUnitPerCharge();
        return chargeNeed;
    }

    protected int getUnitPerCharge() {
        return unitPerCharge;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" "+
                NAME + ", charges left: " + chargeLevel
                ;
    }


    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }

    protected void decreaseChargeLevel(int chargeNeed) {
//        System.out.println("deducting charge needed from chargeLevel "+this.chargeLevel+"-"+chargeNeed);
        chargeLevel = this.chargeLevel-chargeNeed;
//        System.out.println("results in "+chargeLevel);

    }
}
