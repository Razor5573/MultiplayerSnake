package ru.nsu.kalugin.net4.model.ports;

public interface SenderReceiverFactory extends ReceiverFactory {
    GameMessageSender createSender();
}
