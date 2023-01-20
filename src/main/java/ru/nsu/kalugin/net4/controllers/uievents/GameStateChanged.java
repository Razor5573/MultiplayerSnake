package ru.nsu.kalugin.net4.controllers.uievents;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.nsu.kalugin.net4.model.game.GameState;

@RequiredArgsConstructor
@Getter
public class GameStateChanged {
    private final GameState gameState;
}
