package implementacionJavadoc;
/**
 * Clase Empleado
 *
 * Contiene informacion de cada empleado
 *
 * @author Javier Aliaga
 * @version 1.0
 */
public class Empleado {
 
    //Atributos
 
    /**
     * Nombre del empleado
     */
    private String nombre;
    /**
     * Apellido del empleado
     */
    private String apellido;
    /**
     * Edad del empleado
     */
    private int edad;
    /**
     * Salario del empleado
     */
    private double salario;
 
    
    
    //Constructores
    /**
     * Constructor por defecto
     */
    public Empleado(){
        this ("", "", 0, 0);
    }
 
    /**
     * Constructor con 4 parametros
     * @param nombre nombre del empleado
     * @param apellido nombre del empleado
     * @param edad edad del empleado
     * @param salario salario del empleado
     */
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario=salario;
    }
    
    
    //Metodos publicos
 
    /**
     * Suma un plus al salario del empleado si el empleado tiene mas de 35 años
     * @param Plus añadido al salario, 
     * @return <ul>
     *          <li>true: se suma el plus al sueldo</li>
     *          <li>false: no se suma el plus al sueldo</li>
     *          </ul>
     */
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>35 && compruebaNombre()){
            salario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
 
    //Metodos privados
    /**
     * Comprueba que el nombre no este vacio
     * @return <ul>
     *  <li>true: el nombre es una cadena vacia</li>
     *  <li>false: el nombre no es una cadena vacia</li>
     *  </ul>
     */
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
    
   /** 
    * Reescribimos el método toString
    * @Override
    *  
    */
    
    public String toString(){
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("Nombre completo : ").append(nombre).append(" ").append(apellido).append("\nEdad empleado: ").append(edad).append(" años").append("\nSalario: ").append(salario);
		return sb.toString();
    	 	
    	
    }
 
   
}