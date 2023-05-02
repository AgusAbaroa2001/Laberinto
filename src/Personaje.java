import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Personaje {

    private int x=10, y=41;


    private  long tiempoInicial = System.currentTimeMillis();
    private Timer tiempo;
    private int yActual=y, xActual=x;
    private final int movimiento=10;
    Laberinto lab = new Laberinto();

    public Personaje(){
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              long tiempoTranscurrido = System.currentTimeMillis() - tiempoInicial;
              double segundosTranscurridos = tiempoTranscurrido / 1000.0;
                System.out.println("Tiempo transcurrido: "+ segundosTranscurridos+ "segundos");
            }
        });
        tiempo.start();
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x,y,40,40);

    }

    public void keypersonaje(KeyEvent evento){
        int labJuego [][] =lab.lab();

        if(evento.getKeyCode()==38 || evento.getKeyCode()== 87){
            if (y < 40) {
                return;
            }
            if( labJuego [(y/40)][x/40] != 1){
                yActual = y;
                y-= movimiento;
            }else if(labJuego[(y/40)][x/40]==2){
                y-= movimiento;
                long tiempoFinal = System.currentTimeMillis();
                long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
                JOptionPane.showMessageDialog(null,"LLEGASTE A LA META\nTiempo total: " + tiempoTotal + " segundos");
                tiempo.restart();
                x=10;
                y=41;
            } else{
                x=10;
                y=41;
            }
        }

        if(evento.getKeyCode()==40 || evento.getKeyCode()== 83){
            if( labJuego [(y/40)+1][x/40] != 1){
                yActual = y;
                y+= movimiento;
            }else if(labJuego[(y/40)][x/40]==2){
                y+= movimiento;

                long tiempoFinal = System.currentTimeMillis();
                long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
                JOptionPane.showMessageDialog(null,"LLEGASTE A LA META\nTiempo total: " + tiempoTotal + " segundos");
                tiempo.restart();
                x=10;
                y=41;
            }else{
                x=10;
                y=41;
            }
        }

        if(evento.getKeyCode()==37 || evento.getKeyCode()== 65){
            if( labJuego [y/40][(x/40)] != 1){
                xActual = x;
                x-= movimiento;
            }else if(labJuego[(y/40)][x/40]==2){
                x-= movimiento;
                long tiempoFinal = System.currentTimeMillis();
                long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
                JOptionPane.showMessageDialog(null,"LLEGASTE A LA META\nTiempo total: " + tiempoTotal + " segundos");
                tiempo.restart();
                x=10;
                y=41;
            }else{
                x=10;
                y=41;
            }
        }

        if(evento.getKeyCode()==39 || evento.getKeyCode()== 68){
            if( labJuego [y/40][(x/40)+1] != 1){
                xActual = x;
                x+= movimiento;
            }else if(labJuego[(y/40)][x/40]==2){
                x+= movimiento;
                long tiempoFinal = System.currentTimeMillis();
                long tiempoTotal = (tiempoFinal - tiempoInicial) / 1000;
                JOptionPane.showMessageDialog(null,"LLEGASTE A LA META\nTiempo total: " + tiempoTotal + " segundos");
                tiempo.restart();
                x=10;
                y=41;
            }else{
                x=10;
                y=41;
            }
        }
    }


}
