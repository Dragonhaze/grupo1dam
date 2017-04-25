import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Acertijo {
	
	
	//Complements
	
	/**
	 * <p>Declaramos los atributos verdad y respuesta
	 * con sus tipos respectivamente</p>
	 */
	private String verdad;
	private int respuesta;
	
	//Constructor
	
	/**
	 * <p>Constructor por defecto</p>
	 */
	public Acertijo() {
		
	}
	
	/**
	 * <p>Constructor con la variable verdad</p>
	 * <ul>
	 * 	<li>@param verdad</li> 
	 * </ul>
	 */
	public Acertijo( String verdad) {
		
		this.verdad = verdad;
	}

	//Getters and setters
	
	/**
	 * <p>Accesor que mostrar� el par�metro verdad
	 * @return verdad</p>
	 */
	public String getVerdad() {
		return verdad;
	}

	/**
	 * <p>Accesor que modificar� el par�metro verdad
	 * <ul>
	 * <li>@param verdad de tipo cadena</li>
	 * <li>@param respuesta de tipo entero</li>
	 * </ul>
	 * </p>
	 */
	public void setVerdad(String verdad,int respuesta) {
			
		this.verdad = verdad;
		
	}
	/**
	 * Accesor que mostrar� el par�metro respuesta
	 * @return respuesta
	 */
	public int getRespuesta() {
		return respuesta;
	}
	/**
	 * <p>Accesor que modificar� el par�metro respuesta
	 * <ul>
	 * <li>@param respuesta tipo entero si es igual a cinco
	 * da la respuesta sino respuesta es igual a cero</li>
	 * <li>@return respuesta</li>
	 * </ul>
	 * </p>
	 */
	public int setRespuesta(int respuesta) {
		
		if(respuesta==5){
			this.respuesta = respuesta;
		}else{
		
		}
		
		return respuesta;
	
	}

	@Override
	public String toString() {
		return "Juego1 [verdad=" + verdad + "]";
	}
	
	//Methods
	
	/**
	 * M�todo que sirve para a�adir respuesta
	 * del acertijo
	 * @param respueta tipo cadena
	 */
	public void a�adirRespuesta(int respueta){
		Scanner input = new Scanner(System.in);
		System.out.println("introduzca respuesta");
		 int index = input.nextInt();
	}
	
}
