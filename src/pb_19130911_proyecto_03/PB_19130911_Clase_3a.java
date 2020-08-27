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
class Instrumento implements Mostrar{
    protected String marca;
    protected double precio;

    public String getAtributos()
    {
        return "Marca: "+marca+", Precio: "+precio;
    }
    
    /*Este método regresa el tipo de objeto de la clase en cuestión, como una especie de instanceOf
    (este método solo se hizo para que las clases hijas lo sobrecarguen y hagan que
      regresen su objeto original, ya que al crear el objeto ArregloInstrumentos,
      todos sus objetos de adentro se guardan en una referencia de Instrumentos, getInstancia
     nos ayuda a recuperar el objeto original que se guarda en esa referencia gracias al
     bendito polimorfismo) Ejemplo:
    
    Laud laud = new Laud();
    Instrumento [] arreglo = new Instrumento [1];
    Instrumento[0] = laud
    
    //en este momento laud está guardado en una referencia de animal
    
    Instrumento[0].getInstancia().getAtributos
    
    //getInstancia() va a regresar la clase Laud y getAtributos() nos va a mostrar
    //los atributos de la clase Laud en lugar de los de la clase Instrumentos ya que
    //la clase Laud sobrecarga ambos métodos para que regresen sus parámetros
    //el polimorfismo es muy mágico...*/
    public Instrumento getInstancia()
    {
        return this;
    }
    
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

    @Override
    public void dibujar(int x, int y, Graphics g) {
    }

    @Override
    public void mostrar(int xInicial, int yInicial, Graphics g,JLabel j) {
    }
    
    
}
