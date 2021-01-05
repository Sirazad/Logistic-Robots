package com.sirazad.robots;


public class Mac extends Robots {


    public Mac(String name, int chargeLevel) {
        super(name, 10, 10, chargeLevel);

    }

    @Override
    protected int getUnitPerCharge() {
        return 1;
    }

}
