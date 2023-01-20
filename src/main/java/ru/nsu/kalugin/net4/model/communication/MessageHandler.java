package ru.nsu.kalugin.net4.model.communication;

import lombok.NonNull;
import ru.nsu.kalugin.net4.model.ports.Message;

public interface MessageHandler {
    void handle(@NonNull Message message);
}
