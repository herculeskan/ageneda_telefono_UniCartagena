package clases;

import java.util.ArrayList;

/**
 * La clase Contacto representa un contacto con información como código, nombre,
 * apellido y una lista de números de teléfono.
 * 
 * @author Carlos Lara - Jerardo Morales
 */
public class Contacto {
    // Atributos
    private int codigo;             // Código del contacto
    private String nombre;          // Nombre del contacto
    private String apellido;        // Apellido del contacto
    private ArrayList<Numero> numeros;  // Lista de números de teléfono del contacto

    /**
     * Constructor por defecto de la clase Contacto.
     * Inicializa la lista de números.
     */
    public Contacto() {
        numeros = new ArrayList();
    }

    /**
     * Constructor que inicializa la clase Contacto con un código, un nombre,
     * un apellido y una lista de números de teléfono.
     * 
     * @param codigo El código del contacto.
     * @param nombre El nombre del contacto.
     * @param apellido El apellido del contacto.
     * @param numeros Lista de números de teléfono del contacto.
     */
    public Contacto(int codigo, String nombre, String apellido, ArrayList<Numero> numeros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeros = numeros;
    }

    /**
     * Constructor que inicializa la clase Contacto con un código, un nombre
     * y un apellido. Inicializa la lista de números.
     * 
     * @param codigo El código del contacto.
     * @param nombre El nombre del contacto.
     * @param apellido El apellido del contacto.
     */
    public Contacto(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        numeros = new ArrayList();
    }

    /**
     * Obtiene el código del contacto.
     * 
     * @return El código del contacto.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del contacto.
     * 
     * @param codigo El nuevo código del contacto.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del contacto.
     * 
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del contacto.
     * 
     * @param nombre El nuevo nombre del contacto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del contacto.
     * 
     * @return El apellido del contacto.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del contacto.
     * 
     * @param apellido El nuevo apellido del contacto.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la lista de números de teléfono del contacto.
     * 
     * @return La lista de números de teléfono del contacto.
     */
    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    /**
     * Establece la lista de números de teléfono del contacto.
     * 
     * @param numeros La nueva lista de números de teléfono del contacto.
     */
    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }
}
