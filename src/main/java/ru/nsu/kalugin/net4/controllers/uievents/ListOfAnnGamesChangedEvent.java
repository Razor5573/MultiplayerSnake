package ru.nsu.kalugin.net4.controllers.uievents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.nsu.kalugin.net4.model.AnnouncementGame;

import java.util.Collection;

@AllArgsConstructor
@Getter
public class ListOfAnnGamesChangedEvent {
    private final Collection<? extends AnnouncementGame> games;
}
