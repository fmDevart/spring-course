package com.springCourse.learnspringframework;

import game.GameRunner;
import game.GamingConsole;
import game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppGamingSpring
{

    @Bean
    public GamingConsole game(){

        MarioGame game = new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner( GamingConsole game){

        var gameRunner = new GameRunner(game);
        return  gameRunner;
    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppGamingSpring.class);

        context.getBean(GameRunner.class).run();

    }
}
