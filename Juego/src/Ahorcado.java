import java.util.Random;

import java.util.Scanner;
/**
 * 
 * @author David
 *
 */
public class Ahorcado {
	/**
	 * @author David
	 * @param l secuencia para las letras
	 * @param palabra variable 
	 * @return chec
	 */
	public static boolean checar(CharSequence l, String palabra){
		boolean chec;
		chec = palabra.contains(l);
		return chec;
	}
	
	
	public static void main(String[] args){
		Scanner t = new Scanner(System.in);
		Random ran = new Random();
		int r = ran.nextInt(10)+1;
		String palabra = "";
		int error = 0;
		String letra = "";
		char l;
		switch(r){
		/**
		 * Switch que elegir� aleatoriamente una palabra u otra a mostrar para el usuario
		 * @author David
		 */
		case 1: palabra = "java";
		break;
		case 2: palabra = "computador";
		break;
		case 3: palabra = "pc";
		break;
		case 4: palabra = "programacion";
		break;
		case 5: palabra = "david";
		break;
		case 6: palabra = "gomez";
		break;
		case 7: palabra = "ordenador";
		break;
		case 8: palabra = "eclipse";
		break;
		case 9: palabra = "junit";
		break;
		case 10: palabra = "sevilla";
		break;
		}
		/**
		 * Array de char para saber los aciertos
		 */
		 char []psecreta = palabra.toCharArray();
		    int aciertos=0;
		    
				System.out.println("Tama�o de la palabra es " + palabra.length());
		/**
		 * array para colocar las letras correctas en los espacios en blanco
		 */
		    char []aux=new char[palabra.length()];
				for (int i=0;i<palabra.length();i++){
		        aux[i]='_';
		    }
				while(error != 3){
		/**
		 * array 
		 */
		        for (int i=0;i<palabra.length();i++)
		            System.out.print(aux[i]);
		        System.out.println(" ingrese una letra " + ", Errores: "+ error);
		        letra=t.next();
		        l=letra.toCharArray()[0];

		        if(checar(letra, palabra)){

		            for (int i=0;i<palabra.length();i++){
		                if(psecreta[i]==l)
		                {
		                    aciertos++;
		                    aux[i]=l;
		                }
		            }
		        }else{
		            error++;
		            if(error == 3){
		                System.out.println("Perdiste!");
		                break;
		            }
		        }
		        if(aciertos == palabra.length()){
		            System.out.println("Ganaste!!! La palabra era " + palabra);
		            break;
		        }
				}
		
	}
}
