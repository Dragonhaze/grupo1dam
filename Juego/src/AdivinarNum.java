import java.util.Scanner;

public class AdivinarNum {
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
	
	//Contructores
	
	public AdivinarNum(){
		
	}
	
	public AdivinarNum(int max, int min, int guess) {
		super();
		this.max = max;
		this.min = min;
		this.guess = guess;
	}
	
	
	
	
	public void empiezaJuego (){
		this.max = 1000;
		this.min = 1;
		this.guess=500;
		
		System.out.println("Piensa en un numero del "+min+" al "+max);
		
		
		
		System.out.println("Es el número mayor o menor que "+guess+"?");
		System.out.println("Si es mayor introduce 2 o si es menor 1 y si es correcto introduce 3");
		max++;
		
		update();
		
		
	}
	
	public void update(){
		
		Scanner input= new Scanner(System.in);
		userInput = input.nextInt();
		
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
	
	public void sigueJuego (){
		
		guess = (max + min)/2;
		System.out.println("Es el número que has pensado menor o mayor que " +guess+"?");
		
		update();
		
	}
		
}
	
	
	
	
	

