package ru.nsu.kalugin.net4.mappers;

import lombok.NonNull;
import ru.nsu.kalugin.net4.SnakesProto;
import ru.nsu.kalugin.net4.model.AnnouncementGame;

import java.net.InetAddress;

public class AnnouncementMapper {

    private AnnouncementMapper() {
    }

    public static AnnouncementGame of(@NonNull SnakesProto.GameAnnouncement gameAnnouncement,
                                      @NonNull InetAddress senderAddress,
                                      int senderPort) {
        return new AnnouncementGame(senderAddress, senderPort,
                gameAnnouncement.getGameName(),
                gameAnnouncement.getPlayers().getPlayersCount(),
                GameConfigMapper.dto2Model(gameAnnouncement.getConfig()),
                gameAnnouncement.getCanJoin());
    }
}
