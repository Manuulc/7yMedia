import java.util.Scanner;
public class Carta {

	private Palo palo;
	private Valor valor;
	private double sumaTotal;

	//SE CONSTRUYE LA CARTA
	public Carta() {


		valorCartaAleatoria();
		paloCartaAleatoria();
	}

	public double getSumaTotal() {
		return sumaTotal;
	}

	/*Precondiciones: 
	 * Postcondiciones: muestra la carta
	 * Entrada:
	 * Salida:
	 */

	private void mostrarCarta() {

		System.out.println(valor+" de "+palo);
	}

	/*Precondiciones: 
	 * Postcondiciones: asigna un enum Valor aleatorio a valor 
	 * Entrada:
	 * Salida:
	 */
	private void valorCartaAleatoria() {


		int x = (int) (Math.random() * 10) + 1;

		switch(x) {

		case 1: {
			valor = Valor.UNO;
			sumaTotal = 1;
		}break;
		case 2: {
			valor = Valor.DOS;
			sumaTotal = 2;
		}break;
		case 3: {
			valor = Valor.TRES;
			sumaTotal = 3;
		}break;	
		case 4: {
			valor = Valor.CUATRO;
			sumaTotal = 4;
		}break;	
		case 5: {
			valor = Valor.CINCO;
			sumaTotal = 5;
		}break;
		case 6: {
			valor = Valor.SEIS;
			sumaTotal = 6;
		}break;
		case 7: {
			valor = Valor.SIETE;
			sumaTotal = 7;
		}break;
		case 8: {
			valor = Valor.SOTA;
			sumaTotal = 0.5;
		}break;
		case 9: {
			valor = Valor.CABALLO;
			sumaTotal = 0.5;
		}break;
		case 10: {
			valor = Valor.REY;
			sumaTotal = 0.5;
		}break;

		}



	}
	/*Precondiciones: 
	 * Postcondiciones: asigna un enum Palo aleatorio a palo
	 * Entrada:
	 * Salida:
	 */
	private void paloCartaAleatoria() {

		int y = (int) (Math.random() * 4) + 1;

		switch (y) {
		case 1: {
			palo = Palo.COPAS;

		}break;
		case 2: {
			palo = Palo.ESPADAS;

		}break;
		case 3: {
			palo = Palo.BASTOS;

		}break;
		case 4: {
			palo = Palo.OROS;

		}break;
		default:
			throw new IllegalArgumentException();
		}




	}

	//Método para mostrar cuanto vale la carta.
	private void mostrarTotal() {


		System.out.println("Total: "+sumaTotal);


	}

	//Método para mostrar el menu
	public void menu() {


		System.out.println("*******************");
		System.out.println("1 - Nueva carta");
		System.out.println("2 - Me planto");
		System.out.println("");
		System.out.println("*******************");
		System.out.println("¿Que opcion desea realizar?");

		elegirOpcion();


	}

	//Método para elegir carta o plantarse.
	public void elegirOpcion() {

		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();


		if(opcion==1) {

			mostrarCarta();
			mostrarTotal();
		}
		if(opcion==2){

			System.out.println("Has elegido plantarte. Tu carta era");
			mostrarCarta();
		}



	}





}
