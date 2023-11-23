package clases;

/**
 * La clase Tipo representa un tipo con un código y un nombre.
 * 
 * @author Carlos Lara - Jeraldo Morales
 */
public class Tipo {
    // Atributos
    private int codigo;      // Código del tipo
    private String nombre;   // Nombre del tipo
    
    /**
     * Constructor por defecto de la clase Tipo.
     */
    public Tipo(){
    
    }
    
    /**
     * Constructor que inicializa la clase Tipo con un código y un nombre.
     * 
     * @param codigo El código del tipo.
     * @param nombre El nombre del tipo.
     */
    public Tipo(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el código del tipo.
     * 
     * @return El código del tipo.
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Obtiene el nombre del tipo.
     * 
     * @return El nombre del tipo.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Establece el código del tipo.
     * 
     * @param codigo El nuevo código del tipo.
     */
    public void setCodigo(int codigo){
       this.codigo = codigo;
    }
    
    /**
     * Establece el nombre del tipo.
     * 
     * @param nombre El nuevo nombre del tipo.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
