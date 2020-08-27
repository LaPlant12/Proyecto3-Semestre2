/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_19130911_proyecto_03;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author laplant
 */
class Cajon extends Percusion {
    private String madera;

    public Cajon()
    {
        marca = "Meinl";
        precio = 4000;
        tipoAltura = "Indeterminado";
        madera = "requia";
    }
    
    public Cajon(String m, double p, String mad)
    {
        marca = m;
        precio = p;
        tipoAltura = "Indeterminado";
        madera = mad;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public String getTipoAltura() {
        return tipoAltura;
    }

    /*public void setTipoAltura(String tipoAltura) {
        this.tipoAltura = tipoAltura;
    }*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Instrumento getInstancia()
    {
        return this;
    }
    
    @Override
    public String getAtributos()
    {
        return "Marca: "+marca+", Precio: "+precio+", Madera: "+madera;
    }
    
    @Override
    public void mostrar(int xInicial, int yInicial, Graphics g, JLabel j) {
        xInicial = xInicial - 40;
        yInicial = yInicial - 150;
        
        j.setText(getAtributos());
        
        while(xInicial > 0 && yInicial > 0 )
        {
            dibujar(xInicial,yInicial,g);
            
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Laud.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            g.clearRect(xInicial - 30, yInicial, 95, 160);
            
            xInicial -= 8;
            yInicial -= 4;
        }
    }

    @Override
    public void dibujar(int x, int y, Graphics g) {
        g.setColor(new Color(29, 29, 29));
        
        g.fillOval(x, y+85, 3, 3);
        g.fillOval(x+18, y+94, 3, 3);
        g.fillOval(x+47, y+84, 3, 3);
        
        int x1 [] = {x,x,x+20,x+20};
        int y1 [] = {y,y+85,y+95,y+10};
        g.fillPolygon(x1,y1,4);
        
        int x2 [] = {x,x+30,x+50,x+20};
        int y2 [] = {y,y-10,y,y+10};
        g.fillPolygon(x2,y2,4);
        
        g.setColor(new Color(127, 83, 23));
        int x3 [] = {x+20,x+50,x+50,x+20};
        int y3 [] = {y+10,y,y+85,y+95};
        g.fillPolygon(x3,y3,4);
        
        g.drawString("Cajón", x+15, y+120);
        
    }
    
}
