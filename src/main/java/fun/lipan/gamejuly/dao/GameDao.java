package fun.lipan.gamejuly.dao;

import fun.lipan.gamejuly.entity.Game;
import org.apache.ibatis.annotations.Insert;

/**
 * @description:
 * @author: lipan
 * @time: 2020/6/22 14:21
 */
public interface GameDao {
    @Insert("insert into game(request,answer,victory,gmt_create)" +
            "values(#{request},#{answer},#{victory},#{gmtCreate})")
    void insert(Game game);
}