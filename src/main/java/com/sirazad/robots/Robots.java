package com.sirazad.robots;


public class Robots {
    private final String NAME;
    private final int CHARGE_MAX;
    private final int CARRY_MAX;
    private int chargeLevel;
    private int unitPerCharge = 2;


    public Robots(String name, int charge_max, int carry_max, int chargeLevel) {
        NAME = name;
        CHARGE_MAX = charge_max;
        CARRY_MAX = carry_max;
        this.chargeLevel = chargeLevel;
    }

    public void charge(int charge) {
        this.chargeLevel += charge;
    }

    public int carriedAmount(int carryMax, int storedGoods) {
        int carriedAmount = Math.min(carryMax, storedGoods);
        int chargeNeed = carriedAmount*unitPerCharge;
        while (chargeNeed > chargeLevel) {
            carriedAmount--;
        }
        this.chargeLevel -= chargeNeed;
        return carriedAmount;
    }

}
