package ru.nsu.kalugin.net4.model.communication;

import lombok.NonNull;

public class JoinGameException extends Exception{
    public JoinGameException(@NonNull String cause){
        super(cause);
    }
}
