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
class Laud extends Cuerdas {
    
    private String tipo;
    
    public Laud()
    {
        marca = "Alhambra";
        precio = 5000;
        numeroCuerdas = 6;
        tipo = "renacentista";
    }
    
    public Laud(String marca, double precio, String tipo)
    {
        this.marca = marca;
        this.precio = precio;
        numeroCuerdas = 6;
        this.tipo = tipo;
    }

    public Instrumento getInstancia()
    {
        return this;
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

    public String getTipo()
    {
        return tipo;
    }
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
 	
    public String getAtributos()
    {
        return "Marca: "+marca+", Precio: "+precio+", Tipo: "+tipo;
    }
    
    @Override
    public void dibujar(int x, int y, Graphics g) {
        //clavijero
        g.setColor(new Color(54, 31, 16));
        g.fillRect(x, y, 20, 30);
        
        //mástil
        g.setColor(new Color(71, 51, 41));
        g.fillRect(x+5, y+30, 10, 70);
        
        //cuerpo
        g.setColor(new Color(246, 166, 96));
        g.fillOval(x-15, y+100, 50, 60);
        
        //caja de resonancia(?)
        g.setColor(new Color(97, 68, 47));
        g.fillOval(x+6, y+120, 8, 14);
        
        //clavijas y cuerdas
        g.setColor(Color.white);
        for(int i=7; i<30; i+=7)
        {
            g.drawLine(x-3, y+i, x+23, y+i);
        }
        
        //donde se sujetan las cuerdas jaja
        g.setColor(new Color(52, 33, 28));
        g.fillRect(x-3, y+142, 26, 5);
        
        g.drawString("Laúd", x-3, y+165);
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
            
            g.clearRect(xInicial - 30, yInicial, 95, 170);
            
            xInicial -= 8;
            yInicial -= 4;
        }
    }
}
