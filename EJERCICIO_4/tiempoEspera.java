
public class tiempoEspera {
	System.out.println("VACUNACIÓN PACIENTE " + nombre + "-" + dni + "_________________");
	System.out.println("Vacuna 1 " + v1 + " Fecha:" + d1);
	System.out.println("Vacuna 2 " + v2 + " Fecha:" + d2);

	if (v2.equals("")) {
		if (v1.equals("Moderna")) {
			System.out.println("El paciente " + nombre + " debe esperar 5 meses para la vacuna 2 ");
		} else if (v1.equals("Pfizer")) {
			System.out.println("El paciente " + nombre + "debe esperar 4 meses para la vacuna 2 ");
		} else if (v1.equals("Janssen")) {
			System.out.println("El paciente está ya vacuando");
		} else {
			System.out.println("El paciente " + nombre + " está ya vacunado ");
		}
	}
}
