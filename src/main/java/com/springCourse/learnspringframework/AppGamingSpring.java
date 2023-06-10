package com.springCourse.learnspringframework;

import game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingSpring
{
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppGamingConfig.class);

        context.getBean(GameRunner.class).run();

    }
}
