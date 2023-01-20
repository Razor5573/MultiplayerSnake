package ru.nsu.kalugin.net4.model.game.presentation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Cell {
    private final CellType type;
    private final int snakeId;
}
