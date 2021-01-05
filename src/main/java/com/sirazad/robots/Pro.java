package com.sirazad.robots;


public class Pro extends Robots {


    public Pro(String name, int chargeLevel) {
        super(name, 12, 8, chargeLevel);

    }

    @Override
    protected int getUnitPerCharge() {
        return ( super.carriedAmount > 4) ? 2 : 1;
    }
}
