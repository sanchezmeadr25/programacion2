package fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LocalDate
		
		//Obtener la fecha de hoy
		LocalDate hoy=LocalDate.now();
		System.out.println("Fecha de hoy:"+hoy);
		
		//Crear una fecha especifica
		LocalDate fechaCaducidad = LocalDate.of(2026, 12, 31);
		System.out.println("Fecha de caducidad"+fechaCaducidad);
		
		//Como son inmutables hay que guardarlo en una variable nueva
		LocalDate proximaSemana = hoy.plusDays(7);
		LocalDate elMesPasado = hoy.minusMonths(100);
		System.out.println("semana que viene " +proximaSemana);
		System.out.println("hace 100 meses " +elMesPasado);
		
		
		//LocalTime
		
		//Te devuelve la hora del sistema de ahora mismo
		LocalTime hora= LocalTime.now();
		
		
		//Crear horas especificas
		LocalTime horaCierre = LocalTime.of(20, 30);
		//System.out.println("La tienda abre a las: "+horaApertura);
		System.out.println("La tienda cierra a las: "+horaCierre);
		
		
		//LocalDateTime
		LocalDateTime ahora= LocalDateTime.now();
		System.out.println(ahora);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		

}
