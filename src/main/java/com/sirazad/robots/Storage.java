package com.sirazad.robots;

import java.util.List;

public class Storage {
    private int newCharge;
    private int newWares;
    private int currentWares;
    private int[][] logisticPlan;
    private int day = 0;

    public int[][] createLogisticPlan() {
        // first comes chargeLevel, then incomingWares
        logisticPlan[0][0] = 3;
        logisticPlan[0][1] = 20;
        logisticPlan[1][0] = 2;
        logisticPlan[1][1] = 32;
        logisticPlan[2][0] = 5;
        logisticPlan[2][1] = 20;
        logisticPlan[3][0] = 3;
        logisticPlan[3][1] = 16;
        return logisticPlan;
    }

    private void iterateDay() {
        newCharge = logisticPlan[day][0];
        newWares = logisticPlan[day][1];
        currentWares += newWares;
        day++;
    }


    // simulate a day
    public void simulateOneDay(List<Robots> robots) {
        List<Robots> workers = robots;

        iterateDay();
        for (Robots worker: workers) {
            worker.charge(newCharge);
        }
        // check which unit can carry how much


    }


    //
}
