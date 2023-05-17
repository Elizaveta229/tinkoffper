package ru.tinkoff.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.tinkoff.edu.config.ConfigApp;
import ru.tinkoff.edu.config.ConfigApp;

@SpringBootApplication
@EnableConfigurationProperties(ConfigApp.class)
public class BotApplication {
public static void main(String[] args) {
        var ctx = SpringApplication.run(BotApplication.class, args);
        var c = ctx.getBean("BOT", Bot.class);
        new Build(c.getTest());
        
        }

}
