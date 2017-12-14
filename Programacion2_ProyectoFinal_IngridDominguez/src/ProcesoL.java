
import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;
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
public class ProcesoL extends JLabel implements Serializable{
    private int condicionM;
    private ArrayList <Variables> datos = new ArrayList();
    private String  comentarios = "";
    private String nombreC;
    private String codigo = "";
    private static final long SerialVersionUID = 999L;
   
    public ProcesoL() {
        super();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public ProcesoL(int condicionM, String comentarios, String nombreC) {
        this.condicionM = condicionM;
        this.comentarios = comentarios;
        this.nombreC = nombreC;
    }

    public int getCondicionM() {
        return condicionM;
    }

    public void setCondicionM(int condicionM) {
        this.condicionM = condicionM;
    }

    public ArrayList<Variables> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Variables> datos) {
        this.datos = datos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public String toString() {
        return "ProcesoL{"  + ", nombreC=" + nombreC + '}';
    }

    
    
   

}// fin de la clase
