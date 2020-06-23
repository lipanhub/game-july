package fun.lipan.gamejuly.controller;

import fun.lipan.gamejuly.entity.Game;
import fun.lipan.gamejuly.service.GameServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/22 14:20
 */
@Controller
public class GameController {

    @Autowired
    private GameServie gameServie;

    @PostMapping("/game")
    @ResponseBody
    public String game(Game game) {
        gameServie.insert(game);
        if (game.getVictory()){
            return "正确";
        }else {
            return "错误";
        }
    }

    @GetMapping("/")
    public String index(Model model) {
        String gameRequest = gameServie.newGame();
        model.addAttribute("game_request",gameRequest);
        return "index";
    }
}
