
import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class ArbolT extends JTree implements Serializable {
    private ArrayList <Variables> datos = new ArrayList();
    private ArrayList<Metodos> metodos  = new ArrayList();
    private ArbolT herencia;
    private String  nombre;
    private boolean condicion;
    private String codigo= "";
    private String codigocpp= "";
    private String codigoheader= "";
    private String constructores = "";
    private static final long SerialVersionUID = 777L;

    public ArbolT() {
        super();
    }

    public ArbolT getHerencia() {
        return herencia;
    }

    public String getCodigocpp() {
        return codigocpp;
    }

    public void setCodigocpp(String codigocpp) {
        this.codigocpp = codigocpp;
    }

    public String getCodigoheader() {
        return codigoheader;
    }

    public void setCodigoheader(String codigoheader) {
        this.codigoheader = codigoheader;
    }

    public String getConstructores() {
        return constructores;
    }

    public void setConstructores(String constructores) {
        this.constructores = constructores;
    }

    
    
    public void setHerencia(ArbolT herencia) {
        this.herencia = herencia;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    

    public ArrayList<Variables> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Variables> datos) {
        this.datos = datos;
    }

    public ArrayList<Metodos> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodos> metodos) {
        this.metodos = metodos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    public void llenarArbol(JTree arbol, JTable tabla) {
        DefaultTreeModel m = (DefaultTreeModel) arbol.getModel(); // primero capturamos el modelo
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot(); //capturamos el nodo raiz

        
        raiz.removeAllChildren();
        //if (clase.getDatos().size() > 0) {
        Object pro = "Propiedades";
        DefaultMutableTreeNode comp = new DefaultMutableTreeNode(pro);

        for (int i = 0; i <tabla.getRowCount(); i++) {
            DefaultMutableTreeNode variable = new DefaultMutableTreeNode(tabla.getValueAt(i, 0));
            comp.add(variable);
        }// fin del for

        raiz.add(comp);
        m.reload();
        System.out.println("sali del metodo llenar");
        //  }// fin del if 

    }// fin del metodo

    
}// fin de la clase
