package game;

public class GameRunner {

     //MarioGame game;
    GamingConsole game;

//    public GameRunner( MarioGame game ){
//        this.game = game;
//
//    }

    public GameRunner( GamingConsole game ){
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
