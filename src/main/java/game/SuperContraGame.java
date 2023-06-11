package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame")
public class SuperContraGame implements  GamingConsole {

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Defend");
    }

    public void  right() {
        System.out.println("Shot a bullet");
    }

}
