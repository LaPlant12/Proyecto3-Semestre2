/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_19130911_proyecto_03;

import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author laplant
 */
interface Mostrar {
    //Dibuja figura en una posicion x,y
    void dibujar(int x, int y, Graphics g);
    
    //Dibuja desde una posición x,y (esquina inferior derecha) hasta otra posición x,y (esquina superior izquierda)
    void mostrar(int xInicial, int yInicial,Graphics g, JLabel j);
}
