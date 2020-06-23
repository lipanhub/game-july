package fun.lipan.gamejuly.service.impl;

import fun.lipan.gamejuly.dao.GameDao;
import fun.lipan.gamejuly.entity.Game;
import fun.lipan.gamejuly.service.GameServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/22 14:21
 */
@Service
public class GameServiceImpl implements GameServie {

    @Autowired
    private GameDao gameDao;

    @Override
    public void insert(Game game) {
        game.setGmtCreate(System.currentTimeMillis());
        if (isVictory(game)) {
            game.setVictory(true);
        } else {
            game.setVictory(false);
        }
        gameDao.insert(game);
    }

    private boolean isVictory(Game game) {
        String request = game.getRequest();
        String result = reverseEven(request);
        boolean victory = result.equals(game.getAnswer());
        game.setAnswer(result);
        return victory;
    }

    private String reverseEven(String request) {
        char[] chs = request.toCharArray();
        int i = 0, j = chs.length - 1;
        while (i < j) {
            int leftVal = chs[i] - '0';
            int rightVal = chs[j] - '0';
            if (leftVal % 2 == 1) {
                i++;
            } else if (rightVal % 2 == 1) {
                j--;
            } else {
                swap(chs, i, j);
                i++;
                j--;
            }
        }
        return new String(chs);
    }

    private void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }

    @Override
    public String newGame() {
        return String.valueOf((int) (Math.random() * Math.pow(10, 7)) + 1);
    }
}
