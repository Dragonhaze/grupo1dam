import java.util.Scanner;

public class Juego2 {

public static String[] opciones = new String[15];
public static int intentos=10;

public static void main(String[] args) {

opciones[0]="sudoku";
opciones[1]="juegos";
opciones[2]="ahorcado";
opciones[3]="mundo";
opciones[4]="microsoft";
opciones[5]="apple";
opciones[6]="windows";
opciones[7]="linux";
opciones[8]="montaña";
opciones[9]="leon";
opciones[10]="manzana";
opciones[11]="ventanas";
opciones[12]="calor";
opciones[13]="visitas";
opciones[14]="esfuerzo";

//variables
int n = 0; 
for(int i = 1; i<=5; i++)
n=((int)(Math.random()*14 + 1));
//Genera numeros aleatorios en un rango del 0-14


System.out.println("Prueba de Palabra Aleatoria "+opciones[n]+"\n");

System.out.println("-----EL JUEGO DEL AHORCADO-----");
//Bienvenida

Menu();//Llamado al Metodo Menu.

}

public static void NombreJugador(){

Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese su nombre por favor ");
String nombre = teclado.nextLine();
System.out.println("---------------------");
System.out.println("BIENVENIDO "+nombre);
System.out.println("---------------------");

}

public static void Menu(){
Scanner teclado = new Scanner(System.in);
System.out.println("(1)Empezar el juego. \n(2)Salir. ");
int opcion = teclado.nextInt();

switch(opcion){

case 1 : NombreJugador();
break;
case 2 : System.out.println("Hasta el próximo intento");
break;
default: System.out.println("Opcion no valida. \n Vuelve a intentarlo.");
break;

}
}

}
