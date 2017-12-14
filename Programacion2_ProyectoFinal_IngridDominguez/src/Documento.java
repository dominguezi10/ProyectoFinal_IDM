
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
public class Documento extends JLabel implements Serializable {
    private Variables variable;
    private String comentario = "";
    private int condicion;
    private String codigo = "";
    private static final long SerialVersionIUD = 777L;

    public Documento() {
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public Documento(int condicion) {
        this.condicion = condicion;
    }

    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    
    
    
    public Variables getVariable() {
        return variable;
    }

    public void setVariable(Variables variable) {
        this.variable = variable;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Documento{" + "variable=" + variable + ", comentario=" + comentario + '}';
    }
    
    
    
}
