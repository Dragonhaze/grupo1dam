import java.util.Scanner;

/**
 * Esta clase es un juego que adivinana un n�mero que estas pensando
 * @author Duncan Porter
 */

public class AdivinarNum {
	/**
	 * <h1>Variables</h1>
	 */
	int max;	
	int min;
	int guess;
	int userInput;
	
	
	//Accesores
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getGuess() {
		return guess;
	}
	public void setGuess(int guess) {
		this.guess = guess;
	}
	
	//Constructor vacio
	public AdivinarNum(){
		empiezaJuego();
	}
	
	
	
	/**
	 *  Se inicia el juego y se inicializa las variables desadas.
	 * 
	 * @param max: Es el numero m�ximo en el que puede estar el n�mero pensado por el usuario.
	 * @param min: Es el numero minimo en el que puede estar el n�mero pensado por el usuario.
	 * @param guess: Es el numero en al que llegua el ordenador despu�s del algoritmo.
	 * @param userInput: El numero que introduce el usuario.
	 */
	public void empiezaJuego (){
		this.setMax(1000);
		this.setMin(1);
		this.setGuess(500);
		
		System.out.println("Piensa en un numero del "+min+" al "+max);
		
		System.out.println("Es el n�mero mayor o menor que "+guess+"?");
		System.out.println("Si es mayor introduce 2 o si es menor 1 y si es correcto introduce 3");
		max++;
		
		update();
		
		
	}
	/**
	 * Este metodo se repite cada vez que el usuario tiene contestar a la pregunta
	 * si responde 1 , 2 o 3 el programa sigue y si no sigue preguntando.
	 */
	public void update(){
		
		Scanner input= new Scanner(System.in);
		userInput = input.nextInt();
		while(userInput!=1|userInput!=2|userInput!=3){
			if(userInput==2){
				min = guess;
				sigueJuego();
			}
			
			if(userInput==1){
				max = guess;
				sigueJuego();
			}
		
			if(userInput==3){
				System.out.println("Gane!!");
				System.exit(0);
			}
		}
	}
	/**
	 * Este metodo sigue el juego despues de que el usuario responda a la pregunta 
	 */
	public void sigueJuego (){
		
		guess = (max + min)/2;
		System.out.println("Es el n�mero que has pensado menor o mayor que " +guess+"?");
		
		update();
		
	}
		
}
	
	
	
	
	

