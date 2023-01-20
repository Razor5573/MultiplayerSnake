package ru.nsu.kalugin.net4.mappers;

import lombok.NonNull;
import ru.nsu.kalugin.net4.SnakesProto;
import ru.nsu.kalugin.net4.model.game.Direction;

public class DirectionMapper {

    private DirectionMapper(){}

    public static Direction dto2Model(@NonNull SnakesProto.Direction direction){
        return switch (direction) {
            case UP -> Direction.UP;
            case DOWN -> Direction.DOWN;
            case LEFT -> Direction.LEFT;
            case RIGHT -> Direction.RIGHT;
        };
    }

    public static SnakesProto.Direction model2Dto(@NonNull Direction direction){
        return switch (direction) {
            case UP -> SnakesProto.Direction.UP;
            case DOWN -> SnakesProto.Direction.DOWN;
            case LEFT -> SnakesProto.Direction.LEFT;
            case RIGHT -> SnakesProto.Direction.RIGHT;
        };
    }
}
