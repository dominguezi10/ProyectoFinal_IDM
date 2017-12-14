
import java.awt.Component;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1234
 */
public class ArbolClase implements Serializable {

    private static final long SerialVersionUID = 777L;

    public void llenarArbol(ArbolT arbol) {
        DefaultTreeModel m = (DefaultTreeModel) arbol.getModel(); // primero capturamos el modelo
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot(); //capturamos el nodo raiz

        DefaultMutableTreeNode metodos = new DefaultMutableTreeNode();
        if (raiz.getChildCount() == 2) {
            metodos = (DefaultMutableTreeNode) raiz.getChildAt(1);
        }

        Object pro = "Atributos";
        DefaultMutableTreeNode comp = new DefaultMutableTreeNode(pro);

        for (int i = 0; i < arbol.getDatos().size(); i++) {
            Variables var = arbol.getDatos().get(i);

            DefaultMutableTreeNode variable = new DefaultMutableTreeNode(var.getNombre());
            comp.add(variable);
        }// fin del for

        if (raiz.getChildCount() == 2) {
            raiz.removeAllChildren();
            raiz.add(comp);
            raiz.add(metodos);
            m.reload();
        } else {
            raiz.removeAllChildren();
            raiz.add(comp);
            m.reload();
        }

        System.out.println("sali del metodo llenar");
        //  }// fin del if 

    }// fin del metodo

    public void llenarArbolMetodos(ArbolT arbol) {
        /*if(todosMetodos.size()>0){
            
        }*/
        DefaultTreeModel m = (DefaultTreeModel) arbol.getModel(); // primero capturamos el modelo
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot(); //capturamos el nodo raiz

        System.out.println("filas talvez es: " + raiz.getChildCount());
        if (raiz.getChildCount() == 2) {
            raiz.remove(1);
            System.out.println("lo elimine");
        }

        if (raiz.getChildCount() == 1) {
            System.out.println("entre ");
        }

        DefaultMutableTreeNode metodos = new DefaultMutableTreeNode("Metodos");
        for (int i = 0; i < arbol.getMetodos().size(); i++) {
            String nombreMetodo = arbol.getMetodos().get(i).getNombre();
            DefaultMutableTreeNode nombre = new DefaultMutableTreeNode(nombreMetodo);
            metodos.add(nombre);
        }// fin del for

        raiz.add(metodos);
        m.reload();
    }// fin del if

}// fin de la clase
