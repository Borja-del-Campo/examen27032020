package ejercicio_examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjercicioJunitTest {
	
	static int a = 100;
	static int b = 20;

	@Test
	void testSuma() {
		System.out.println("Empieza el test Suma: ");
		EjercicioJunit ejercicio = new EjercicioJunit();
		
		int resultado = ejercicio.sumar();
		int esperado = 120;
		
		assertEquals(esperado, resultado);
		
		System.out.println("Test Finalizado.");
	}
	
	@Test
	void testResta() {
		System.out.println("Empieza el test Resta: ");
		EjercicioJunit ejercicio = new EjercicioJunit();
		
		int resultado = ejercicio.restar();
		int esperado = 80;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testDividir() {
		System.out.println("Empieza el test Dividir: ");
		EjercicioJunit ejercicio = new EjercicioJunit();
		
		int resultado = ejercicio.dividir();
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testMultiplicar() {
		System.out.println("Empieza el test Multiplicar: ");
		EjercicioJunit ejercicio = new EjercicioJunit();
		
		int resultado = ejercicio.multiplicar();
		int esperado = 2000;
		
		assertEquals(esperado, resultado);
	}

}
