package com.sirazad.robots.dao;

import com.sirazad.robots.model.Robots;

import java.util.ArrayList;
import java.util.List;

public class DaoManager {
    public DaoType daoType = DaoType.FILE;

    public List<Robots> getData() {
        List<Robots> robots = new ArrayList<>();
        if (this.daoType.equals(DaoType.FILE)) robots = getDataFromFile();
        if (this.daoType.equals(DaoType.JDBC)) robots = getDataFromJDBC();
        return robots;
    }

    private List<Robots> getDataFromFile() {
        List<Robots> robots = new ArrayList<>();
        //TODO code DaoFile, implement its methods here
        return robots;
    }


    private List<Robots> getDataFromJDBC() {
        List<Robots> robots = new ArrayList<>();
        //TODO code DaoJDBC, implement its methods here
        return robots;
    }

}

enum DaoType {
    FILE, JDBC
}
