
import java.io.Serializable;
import javax.swing.JLabel;



/**
 *
 * @author 1234
 */


public class Desicion extends JLabel implements Serializable{
    private static final long SerialVersionUID =777L;
    private int condicion = 0;
    private String codigo = "";
    private Variables variable;

    public Desicion() {
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

    public Variables getVariable() {
        return variable;
    }

    public void setVariable(Variables variable) {
        this.variable = variable;
    }

    
    
    
    
}// fin de la clase
