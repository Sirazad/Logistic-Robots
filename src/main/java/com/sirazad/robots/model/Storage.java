package com.sirazad.robots.model;

import java.util.List;

public class Storage {
    private int newCharge;
    private int currentWares;
    private final int[][] LOGISTIC_PLAN = new int[4][2];
    private int day = 0;

    public int[][] createLogisticPlan() {
        // first comes chargeLevel, then incomingWares
        LOGISTIC_PLAN[0][0] = 3;
        LOGISTIC_PLAN[0][1] = 20;
        LOGISTIC_PLAN[1][0] = 2;
        LOGISTIC_PLAN[1][1] = 32;
        LOGISTIC_PLAN[2][0] = 5;
        LOGISTIC_PLAN[2][1] = 20;
        LOGISTIC_PLAN[3][0] = 3;
        LOGISTIC_PLAN[3][1] = 16;
        return LOGISTIC_PLAN;
    }

    private void iterateDay() {
        newCharge = LOGISTIC_PLAN[day][0];
        int newWares = LOGISTIC_PLAN[day][1];
        currentWares += newWares;
        day++;
    }


    // simulate a day

    public void simulateOneDay(List<Robots> robots) {

        iterateDay();
        for (Robots worker: robots) {
            worker.charge(newCharge);
            currentWares -= worker.getCarriedAmount(currentWares);
            System.out.println(worker.toString()+ " carried "+ worker.carriedAmount+
                    " and  remaining goods "+currentWares);
        }
    }
}
