import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Juego1 {
	
	//Complements
	
	private String verdad;
	private int respuesta;
	
	//Constructor
	
	public Juego1() {
		
	}

	public Juego1( String verdad) {
		
		this.verdad = verdad;
	}

	//Getters and setters

	public String getVerdad() {
		return verdad;
	}


	public void setVerdad(String verdad,int respuesta) {
			
		this.verdad = verdad;
		
	}

	public int getRespuesta() {
		return respuesta;
	}

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
	
	public void añadirRespuesta(int respueta){
		Scanner input = new Scanner(System.in);
		System.out.println("introduzca respuesta");
		 int index = input.nextInt();
	}
	
}
