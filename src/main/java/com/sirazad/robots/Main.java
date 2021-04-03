package com.sirazad.robots;


import com.sirazad.robots.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Storage depo = new Storage();
        List<Robots> workers = new ArrayList();
        workers.add(new Mac("R2", 4));
        workers.add(new Eco("3CR", 3));
        workers.add(new Pro("BB8", 10));
        workers.add(new Eco("E12", 4));

        int[][] logisticPlan = depo.createLogisticPlan();

        depo.simulateOneDay(workers);
        depo.simulateOneDay(workers);
        depo.simulateOneDay(workers);
        depo.simulateOneDay(workers);

    }
}
