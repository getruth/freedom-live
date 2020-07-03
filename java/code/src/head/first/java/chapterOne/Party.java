package head.first.java.chapterOne;
import java.awt.*;
import java.awt.event.*;
class PoolPuzzleOne {
    public void Test() {
        int x = 0;
        while (x < 4) {
            System.out.print("");
            if (x < 1) {
                System.out.print("a");
            }
            if (x > 1) {


            }
            if(x == 1) {

            }
            if(x < 3) {

            }
            System.out.println("");
            x = x + 1;
        }
    }
}
public class Party {
    public void buildInvite() {
        Frame f = new Frame();
        Label i = new Label("Party at yulan's");
        Button b = new Button("You bet!");
        Button c = new Button("Shoot me!");
        Panel p = new Panel();
        p.add(i);
        p.isShowing();
    }
    public static void main(String []agrs) {
        Party party = new Party();
        party.buildInvite();
        while(true) {
            
        }
    }
}
