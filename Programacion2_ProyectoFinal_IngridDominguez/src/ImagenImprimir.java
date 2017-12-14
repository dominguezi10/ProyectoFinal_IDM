
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.Serializable;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1234
 */
public class ImagenImprimir implements Serializable {
    private static final long SerialVersionUID = 777L;
    private JPanel base = new JPanel();
    private File archivo = null;
    private BufferedImage Imagen;
    private String codigo = "";
    private int seleccion;
    //private JFileChooser jfc = new JFileChooser();

    public ImagenImprimir() {
    }

    public JPanel getBase() {
        return base;
    }

    public void setBase(JPanel Base) {
        this.base = Base;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void CrearImagen() {
        this.Imagen = new BufferedImage(base.getWidth(), base.getHeight(), BufferedImage.TYPE_INT_ARGB_PRE);
        Graphics G = Imagen.getGraphics();
        base.paintAll(G);
    }

    public BufferedImage GetImagen() {
        return this.Imagen;
    }
}
