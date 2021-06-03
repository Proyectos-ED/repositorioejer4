package refactorizacion;

/*
 * @author Adrian George Olteanu
 * @version 1.0.0
 * @param entrada: dni=DNI, nv=Número vacuna, v1=Vacuna 1, v2=Vacuna 2
 * d1=Día 1, d2=Día 2
 */

import java.util.Scanner;

public class GestionVacunas {

	public static void main(String[] args) {

		String nombre, dni, nv = "", v1 = "", v2 = "", d1 = "", d2 = "";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del paciente:");
		nombre = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dni = teclado.next();
		System.out.println("Vacuna 1 o 2?");
		nv = teclado.next();
	}
}
