package fun.lipan.gamejuly.entity;

import lombok.Data;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/21 22:33
 */
@Data
public class Game {
    private Long id;
    private String request;
    private String answer;
    private Long gmtCreate;
    private Boolean victory;
}
