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
class Shamisen extends Cuerdas {
    private String piel;
    
    public Shamisen()
    {
        marca = "Bachido";
        precio = 7000;
        numeroCuerdas = 3;
        piel = "gato";
    }
    
    public Shamisen(String marca, double precio, String piel)
    {
        this.marca = marca;
        this.precio = precio;
        numeroCuerdas = 3;
        this.piel = piel;
    }
    
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
    
    public int getNumeroCuerdas() 
    {
	return numeroCuerdas;
    }
    public void setNumeroCuerdas(int numeroCuerdas)
    {
	this.numeroCuerdas = numeroCuerdas;
    }
    
    public String getPiel() 
    {
	return piel;
    }
    public void setPiel(String piel)
    {
	this.piel = piel;
    }
    
    @Override
    public String getAtributos()
    {
        return "Marca: "+marca+", Precio: "+precio+", Piel: "+piel;
    }
    
    @Override
    public Instrumento getInstancia()
    {
        return this;
    }
    
    @Override
    public void dibujar(int x, int y, Graphics g){
        //clavijero
        g.setColor(new Color(44, 21, 11));
        g.fillRect(x, y, 10, 20);

        //mástil
        g.fillRect(x+2, y+20, 6, 92);
        
        //clavijas
        g.setColor(new Color(4, 26, 19));
        g.fillRect(x+10, y+4, 14, 4);
        g.fillRect(x-14, y+8, 14, 4);
        g.fillRect(x+10, y+12, 14, 4);
        
        //cuerpo
        g.setColor(new Color(189, 204, 204));
        g.fillRect(x-11, y+112, 32, 38);
        
        //bolita jaja
        g.setColor(new Color(3, 11, 47));
        g.fillOval(x+2, y+150, 4, 5);
        
        g.drawString("Shamisen", x+11, y+160);
    }
    
    
    @Override
    public void mostrar(int xInicial, int yInicial,Graphics g, JLabel j){
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
}
