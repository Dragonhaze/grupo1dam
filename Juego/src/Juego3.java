
public class Juego3 {
	int max;
	int min;
	int guess;
	int input;
	
	
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
	
	//Contructores
	
	public Juego3(){
		
	}
	
	public Juego3(int max, int min, int guess) {
		super();
		this.max = max;
		this.min = min;
		this.guess = guess;
	}
	
	
	
	
	public void empiezaJuego (int max,int min, int guess){
		this.max = 1000;
		this.min = 1;
		this.guess=500;
		
		System.out.println("Piensa en un numero del "+min+" al "+max);
		
		
		
		System.out.println("Es el número mayor o menor que "+guess+"?");
		System.out.println("Si es mayor introduce 1 o si es menor 0 y si es correcto introduce 2");
		max++;
		if(input!=2){
			sigueJuego(max,min,guess);
		}
	}
	
	public void sigueJuego (int max,int min,int guess){
		
		while (input!=2){
			
		}
		
	}
	
	
	
	
	
}
