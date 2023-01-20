package ru.nsu.kalugin.net4.net;

import lombok.SneakyThrows;
import ru.nsu.kalugin.net4.model.ports.SenderReceiverFactory;
import ru.nsu.kalugin.net4.model.ports.SenderReceiverFactoryCreator;

public class UdpSenderReceiverFactoryCreator implements SenderReceiverFactoryCreator {

    @Override
    @SneakyThrows
    public SenderReceiverFactory newFactory() {
        return new UdpSenderReceiverFactory();
    }
}
