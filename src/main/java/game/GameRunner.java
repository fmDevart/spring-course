package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

     //MarioGame game;
    GamingConsole game;

//    public GameRunner( MarioGame game ){
//        this.game = game;
//
//    }

    public GameRunner(  @Qualifier("SuperContraGame") GamingConsole game ){
        this.game = game;

    }

    public void run(){
        System.out.println( "Running game: " + game);
        game.up();
        game.right();
        game.down();
        game.left();
    }


}
