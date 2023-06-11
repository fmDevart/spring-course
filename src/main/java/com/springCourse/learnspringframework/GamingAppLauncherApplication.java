package com.springCourse.learnspringframework;

import game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("game")
public class GamingAppLauncherApplication
{

//    @Bean
//    public GamingConsole game(){
//
//        MarioGame game = new MarioGame();
//        return game;
//    }
//
//    @Bean
//    public GameRunner gameRunner( GamingConsole game){
//
//        var gameRunner = new GameRunner(game);
//        return  gameRunner;
//    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);

        System.out.println("ciao mondo");
        context.getBean(GameRunner.class).run();

    }
}
