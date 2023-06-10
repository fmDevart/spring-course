package com.springCourse.learnspringframework;

import game.GameRunner;
import game.GamingConsole;
import game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingConfig {

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



}
