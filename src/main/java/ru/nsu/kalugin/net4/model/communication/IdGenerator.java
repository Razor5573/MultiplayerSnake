package ru.nsu.kalugin.net4.model.communication;

import java.util.Random;

public class IdGenerator {
    private int id  = new Random().nextInt();

    public int nextId(){
        return id++;
    }
}
