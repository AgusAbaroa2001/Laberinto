import java.awt.*;
import java.awt.event.KeyEvent;

public class Personaje {

    private int x=20, y=20;
    private int xActual = x, yActual = y;
    private final int movimiento=10;
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x,y,30,30);

    }

    public void keypersonaje(KeyEvent evento){
        if(evento.getKeyCode()==38){

            y-= movimiento;

        }

        if(evento.getKeyCode()==40){
            y+= movimiento;

        }

        if(evento.getKeyCode()==37){
            x-= movimiento;

        }

        if(evento.getKeyCode()==39){
            x+= movimiento;
        }
    }


}
