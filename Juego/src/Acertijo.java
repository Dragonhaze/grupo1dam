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
	 * <p>Accesor que mostrará el parámetro verdad
	 * @return verdad</p>
	 */
	public String getVerdad() {
		return verdad;
	}

	/**
	 * <p>Accesor que modificará el parámetro verdad
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
	 * Accesor que mostrará el parámetro respuesta
	 * @return respuesta
	 */
	public int getRespuesta() {
		return respuesta;
	}
	/**
	 * <p>Accesor que modificará el parámetro respuesta
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
	 * Método que sirve para añadir respuesta
	 * del acertijo
	 * @param respueta tipo cadena
	 */
	public void añadirRespuesta(int respueta){
		Scanner input = new Scanner(System.in);
		System.out.println("introduzca respuesta");
		 int index = input.nextInt();
	}
	
}
