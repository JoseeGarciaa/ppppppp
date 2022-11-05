package taller;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		Futbolista fut = new Futbolista();
		
		Entrenador ent = new Entrenador();
		
		Masajista mas = new Masajista();
		
		Persona per = new Persona();
		
		int dato;
	System.out.println("digite un numero para escoger la clase");
	System.out.println("digite 1 para ir a clase futbolista");
	System.out.println("digite 2 para ir a clase entrenador");
	System.out.println("digite 3 para ir a clase masajista");
	dato = leer.nextInt();
	
	if(dato==1) {
		per.viajar();
		fut.viajarFutbolista();
	}
	if (dato==2) {
		per.viajar();
		ent.ViajarEntrenador();
	}
	if (dato==3) {
	per.viajar();
	mas.viajarMasajista();
	}
	
	
	
	}

}
