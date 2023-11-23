package clases;

/**
 * La clase Numero representa un número de teléfono con un código, un número y
 * un tipo asociado.
 * 
 * @author Carlos Lara - Jerardo Morales - Hawer Morales - Diego Arias - Yeshua Martínez
 */
public class Numero {
    // Atributos
    private int codigo;       // Código del número de teléfono
    private String numero;    // Número de teléfono
    private Tipo tipo;        // Tipo asociado al número

    /**
     * Constructor por defecto de la clase Numero.
     * Inicializa el tipo con un nuevo objeto de la clase Tipo.
     */
    public Numero() {
        tipo = new Tipo();
    }

    /**
     * Constructor que inicializa la clase Numero con un código, un número y un tipo.
     * 
     * @param codigo El código del número de teléfono.
     * @param numero El número de teléfono.
     * @param tipo El tipo asociado al número.
     */
    public Numero(int codigo, String numero, Tipo tipo) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
    }

    /**
     * Obtiene el código del número de teléfono.
     * 
     * @return El código del número de teléfono.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del número de teléfono.
     * 
     * @param codigo El nuevo código del número de teléfono.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el número de teléfono.
     * 
     * @return El número de teléfono.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número de teléfono.
     * 
     * @param numero El nuevo número de teléfono.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene el tipo asociado al número de teléfono.
     * 
     * @return El tipo asociado al número de teléfono.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo asociado al número de teléfono.
     * 
     * @param tipo El nuevo tipo asociado al número de teléfono.
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
