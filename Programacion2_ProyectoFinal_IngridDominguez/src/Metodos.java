
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class Metodos implements Serializable{
    private static final long SerialVersionUID =777L;
    private String nombre;
    private String tipo;
    private String alcance;
    private ArrayList<Parametro> parametros = new ArrayList();

    public Metodos(String nombre, String tipo, String alcance) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.alcance = alcance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public ArrayList<Parametro> getParametros() {
        return parametros;
    }

    public void setParametros(ArrayList<Parametro> parametros) {
        this.parametros = parametros;
    }

    @Override
    public String toString() {
        return "Metodos{" + "nombre=" + nombre + ", tipo=" + tipo + ", alcance=" + alcance + ", parametros=" + parametros + '}';
    }
    
    
    
    
    
    
}// fin de la clase
