import java.util.Scanner;
/**
 * 
 * @author dunca
 *
 */
public class Main {

	public static void main(String[] args) {
		int userInput;
		/**
		 * Menu para que el usuario elija el juego.
		 */
		System.out.println("Elige uno de los siguientes juegos");
		System.out.println("Introduce 1 para un acertijo");
		System.out.println("Introduce 2 para jugar al ahorcado");
		System.out.println("Introduce 3 para jugar a pensar un n�mero");
		
		Scanner input = new Scanner(System.in);
		
		userInput = input.nextInt();
		
		/**
		 * Elecci�n del juego 1
		 */
		if(userInput==1){
		Acertijo juego1 = new Acertijo();
		
		System.out.println("Si 5 gatos cazan 5 ratones en 5 minutos, �Cuantos gatos cazaran 100 ratones en 100 minutos?");

		juego1.a�adirRespuesta(5);
		}
		/**
		 * Elecci�n del juego 2
		 */
		if(userInput==2){
			Ahorcado test = new Ahorcado();
			Ahorcado.main(args);
		}
		/**
		 * Elecci�n del juego 3
		 */
		if(userInput==3){
			AdivinarNum test2 = new AdivinarNum();
			test2.empiezaJuego();
		}
	}
	
	

}
