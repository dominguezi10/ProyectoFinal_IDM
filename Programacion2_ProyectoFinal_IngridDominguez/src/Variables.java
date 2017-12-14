
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 1234
 */
public class Variables implements Serializable{
    private String c;
    private String nombreV;
    private String tipo;
    private String alcance;
    private static final long SerialVersionUID = 888L;
    
    public Variables() {
    }

    public Variables( String nombreV, String tipo, String alcance, String c) {
        this.c = c;
        this.nombreV = nombreV;
        this.tipo = tipo;
        this.alcance = alcance;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getNombre() {
        return nombreV;
    }

    public void setNombre(String nombre) {
        this.nombreV = nombre;
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

    @Override
    public String toString() {
        return nombreV;
    }

    
    
    
}
