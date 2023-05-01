import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.*;


public class Juego extends JPanel{


    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();


    public Juego(){
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {



            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.keypersonaje(e);


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setFocusable(true);
    }


    @Override
    public void paint(Graphics g){

          laberinto.paint(g);
          personaje.paint(g);
    }
    public static void main(String[] args){
        JFrame vtn = new JFrame("Laberinto");

        Juego juego = new Juego();
        vtn.add(juego);
        vtn.setSize(1920,1440);
        vtn.setLocation(0,0);
        vtn.setVisible(true);
        vtn.setBackground(Color.black);



        vtn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            vtn.repaint();
        }

    }
}
