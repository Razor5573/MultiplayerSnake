package ru.nsu.kalugin.net4.model.ports;

import lombok.*;
import ru.nsu.kalugin.net4.SnakesProto;

import java.net.InetAddress;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString
public class Message {
    private final SnakesProto.GameMessage message;
    private final InetAddress address;
    private final int port;
    @Setter
    private long sentAt;
}
