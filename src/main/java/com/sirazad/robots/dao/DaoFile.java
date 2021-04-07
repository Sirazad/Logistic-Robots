package com.sirazad.robots.dao;

import com.sirazad.robots.model.Eco;
import com.sirazad.robots.model.Mac;
import com.sirazad.robots.model.Pro;
import com.sirazad.robots.model.Robots;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DaoFile {
    private Path path;

    public List<String> readFile(String fileName) {
        try {
            this.path = Path.of(fileName);
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Could not read file.");
        }
        return null;
    }

    public List<Robots> getContestants(List<String> participants) {
        List<Robots> robots = new ArrayList<>();
        Iterator iterator = participants.iterator();
        while (iterator.hasNext()) {
            String[] singleRobot = ((String) iterator.next()).split(" ");
            String type = singleRobot[0];
            String name = singleRobot[1];
            int chargeLevel = Integer.parseInt(singleRobot[2]);
            robots.add(createRobot(type, name, chargeLevel));
        }
        return robots;
    }

    private Robots createRobot(String type, String name, int chargeLevel) {
        Robots robot = null;
        switch (type) {
            case "Mac":
                robot = new Mac(name, chargeLevel);
                break;
            case "Eco":
                robot = new Eco(name, chargeLevel);
                break;
            case "Pro":
                robot = new Pro(name, chargeLevel);
                break;
        }
        return robot;
    }
}
