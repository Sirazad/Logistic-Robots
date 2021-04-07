package com.sirazad.robots;


import com.sirazad.robots.dao.DaoManager;
import com.sirazad.robots.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Storage depo = new Storage();
        DaoManager manager = new DaoManager();
        List<Robots> workers = manager.getData();

        int[][] logisticPlan = depo.createLogisticPlan();
        depo.simulateOneDay(workers);
        depo.simulateOneDay(workers);
        depo.simulateOneDay(workers);
        depo.simulateOneDay(workers);

    }
}
