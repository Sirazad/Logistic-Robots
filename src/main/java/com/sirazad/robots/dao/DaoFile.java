package com.sirazad.robots.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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
}
