/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_19130911_proyecto_03;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author laplant
 */
class Campana extends Percusion {
    
    private String material;

    public Campana()
    {
        marca = "Artvarko";
        precio = 1000;
        tipoAltura = "determinada";
        material = "bronce";
    }
    
    public Campana(String marca, double precio, String material) 
    {
        this.marca = marca;
        this.precio = precio;
        tipoAltura = "determinada";
        this.material = material;
    }

    public String getMaterial() 
    {
        return material;
    }

    public void setMaterial(String material) 
    {
        this.material = material;
    }

    public String getTipoAltura() 
    {
        return tipoAltura;
    }

    /* es fija
    public void setTipoAltura(String tipoAltura) 
    {
        this.tipoAltura = tipoAltura;
    }*/

    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca) 
    {
        this.marca = marca;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    
    @Override
    public String getAtributos()
    {
        return "Marca: "+marca+", Precio: "+precio+", Material: "+material;
    }
    
    @Override
    public Instrumento getInstancia()
    {
        return this;
    }
    
    
    @Override
    public void mostrar(int xInicial, int yInicial, Graphics g, JLabel j) {
        xInicial = xInicial - 50;
        yInicial = yInicial - 80;
        
        j.setText(getAtributos());
        
        while(xInicial > 0 && yInicial > 0 )
        {
            dibujar(xInicial,yInicial,g);
            
            try{
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Laud.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            g.clearRect(xInicial - 30, yInicial, 95, 100);
            
            xInicial -= 8;
            yInicial -= 5;
        }
    }

    @Override
    public void dibujar(int x, int y, Graphics g) {
        g.setColor(new Color(255, 205, 24));
        g.fillOval(x, y, 40, 20);
        
        g.setColor(new Color(251, 144, 27));
        g.fillOval(x-17, y+40, 73, 20);
        
        g.setColor(new Color(209, 144, 32));
        g.fillOval(x+15, y+48, 10, 10);
        
        //triángulos y rectángulo
        g.setColor(new Color(255, 205, 24));
        g.fillRect(x, y+10, 40, 43);
        int puntosX1 [] = {x,x-20,x};
        int puntosY1 [] = {y+32,y+53,y+53};
        g.fillPolygon(puntosX1, puntosY1, 3);
        
        int puntosx2 [] = {x+40,x+60,x+40};
        int puntosy2 [] = {y+32,y+53,y+53};
        g.fillPolygon(puntosx2,puntosy2,3);
        
        g.drawString("Campana", x-5, y+75);
        
    }
    
}
