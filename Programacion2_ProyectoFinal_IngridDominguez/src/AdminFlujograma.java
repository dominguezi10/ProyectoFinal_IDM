
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
public class AdminFlujograma implements Serializable {

    private ArrayList<Component> todosComponentes = new ArrayList();
    private ArrayList<EntradaL> entradas = new ArrayList();
    private ArrayList<ProcesoL> procesos = new ArrayList();
    private File archivo = null;
    private static final long SerialVersionUID = 777L;

    public AdminFlujograma(String path) {
        archivo = new File(path);

    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<EntradaL> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<EntradaL> entradas) {
        this.entradas = entradas;
    }

    public ArrayList<ProcesoL> getProcesos() {
        return procesos;
    }

    public void setProcesos(ArrayList<ProcesoL> procesos) {
        this.procesos = procesos;
    }

    public ArrayList<Component> getTodosComponentes() {
        return todosComponentes;
    }

    public void setTodosComponentes(ArrayList<Component> todosComponentes) {
        this.todosComponentes = todosComponentes;
    }

    
    
    //para cargar el archivo
    public void cargarArchivo() {
        try {
            todosComponentes = new ArrayList();
            Component comp;

            if (archivo.exists()) { // si existe
                FileInputStream LaEntrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(LaEntrada);

                try {
                    while ((comp = (Component) objeto.readObject()) != null) {
                        todosComponentes.add(comp);
                        System.out.println("eestoy ");
                    }// fin del while
                } catch (Exception e) {
                }

                
                objeto.close();
                LaEntrada.close();
                
            }// fin del if

        } catch (Exception e) {
            e.printStackTrace();
        }

    }// fin del metodo para cargar
    
    
    
    // para abrir el archivo
    public void escribirArchivo() throws IOException{
        FileOutputStream fw = null;
        ObjectOutputStream ow = null;
        
        try {
            fw = new FileOutputStream(archivo);
            ow = new ObjectOutputStream(fw);
            
            for (Component t : todosComponentes) {
                ow.writeObject(t);
            }
            
            ow.flush();
        } catch (Exception e) {
        }
        
        ow.close();
        fw.close();
    }// fin del metodo para abrir

}
