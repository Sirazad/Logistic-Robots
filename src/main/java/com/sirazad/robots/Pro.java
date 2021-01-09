package com.sirazad.robots;


public class Pro extends Robots {


    public Pro(String name, int chargeLevel) {
        super(name, 12, 8, chargeLevel);

    }


    public int getCarriedAmount(int storedGoods) {
        carriedAmount = Math.min(CARRY_MAX, storedGoods);
        this.getChargeNeed();

        while (chargeNeed > getChargeLevel()) {
            carriedAmount--;
            this.getChargeNeed();
        }
        super.decreaseChargeLevel(chargeNeed);
        return carriedAmount;
    }


    public int getChargeNeed() {
        int temp = carriedAmount;
        int counter = 0;
        while (temp >5) {
            counter +=2;
            temp--;
        }
        while (temp > 0) {
            counter ++;
            temp--;
        }
        super.chargeNeed = counter;
        return counter;
    }
}
