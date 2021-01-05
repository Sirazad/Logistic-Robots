package com.sirazad.robots;


public abstract class Robots {
    private final String NAME;
    protected final int CHARGE_MAX;
    protected final int CARRY_MAX;
    private int chargeLevel;
    private int unitPerCharge = 2;
    int carriedAmount = 0;


    public Robots(String name, int charge_max, int carry_max, int chargeLevel) {
        NAME = name;
        CHARGE_MAX = charge_max;
        CARRY_MAX = carry_max;
        this.chargeLevel = chargeLevel;
    }

    public void charge(int charge) {
        this.chargeLevel += charge;
    }

    public int getCarriedAmount(int carryMax, int storedGoods) {
        carriedAmount = Math.min(carryMax, storedGoods);
        int chargeNeed = (carriedAmount+1)/getUnitPerCharge();
        while (chargeNeed > chargeLevel) {
            carriedAmount--;
        }
        this.chargeLevel -= chargeNeed;
        return carriedAmount;
    }

    protected int getUnitPerCharge() {
        return unitPerCharge;
    }

}
