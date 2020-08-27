/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb_19130911_proyecto_03;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author laplant
 */
class ArregloInstrumentos {
    
    private Instrumento [] arreglo;
    
    public ArregloInstrumentos(Instrumento laud, Instrumento shamisen, Instrumento campana, Instrumento cajon)
    {
        arreglo = new Instrumento[4];
        
        arreglo[0] = laud;
        arreglo[1] = shamisen;
        arreglo[2] = campana;
        arreglo[3] = cajon;
    }
    
    public void alfabeticoMarca()
    {
        for(int i = 0; i < arreglo.length; i++ )
            for(int j = i + 1; j < arreglo.length; j++)
                if(arreglo[j].getMarca().compareTo(arreglo[i].getMarca()) < 0)
                    {  
                        Instrumento temp = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = temp;
                    }
    }
    
    public void descendientePrecio()
    {
        for(int i = 0; i < arreglo.length; i++ )
            for(int j = i + 1; j < arreglo.length; j++)
                if(arreglo[j].getPrecio() > arreglo[i].getPrecio())
                    {  
                        Instrumento temp = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = temp;
                    }
    }
    
    public Instrumento getPosicion(int n)
    {
        return arreglo[n];
    }
    
    public void mostrar(JLabel l1, JLabel l2, JLabel l3, JLabel l4)
    {
        l1.setText(arreglo[0].getInstancia().getAtributos());
        l2.setText(arreglo[1].getInstancia().getAtributos());
        l3.setText(arreglo[2].getInstancia().getAtributos());
        l4.setText(arreglo[3].getInstancia().getAtributos());
    }
}
