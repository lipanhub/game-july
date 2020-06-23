package fun.lipan.gamejuly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.lipan.gamejuly.dao")
public class GameJulyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameJulyApplication.class, args);
    }

}
