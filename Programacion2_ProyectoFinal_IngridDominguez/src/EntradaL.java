
import java.io.Serializable;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class EntradaL extends JLabel implements  Serializable{
    private String codigo = "";
    private String Creador;
    private Variables variable;
    private int condicion = 0;
    private static final long SerialVersionUID = 555L;
    
    public EntradaL() {
        super();
    }

    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    public EntradaL(String Creador) {
        this.Creador = Creador;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String Creador) {
        this.Creador = Creador;
    }

    public Variables getVariable() {
        return variable;
    }

    public void setVariable(Variables variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Entrada{" + "Creador=" + Creador + ", variable=" + variable + '}';
    }

    
    
    
    
}// fin de la clase
