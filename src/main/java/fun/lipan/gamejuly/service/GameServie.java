package fun.lipan.gamejuly.service;

import fun.lipan.gamejuly.entity.Game;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/22 14:21
 */
public interface GameServie {
    void insert(Game game);

    String newGame();
}
