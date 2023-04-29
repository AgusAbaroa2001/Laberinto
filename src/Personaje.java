import java.awt.*;

public class Personaje {

    private int x=40, y=40;
    private final int movimiento=40;
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x,y,30,30);

    }
}
