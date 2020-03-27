package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	

	@Test
	void testSumar() {
		Calculadora calculadora = new Calculadora();
		int x = 5;
		int y = 10;
		
		int resultado = calculadora.sumar(x, y);
			
		int esperado = 15;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testRestar() {
		Calculadora calculadora = new Calculadora();
		int x = 5;
		int y = 10;
		int z = 5;
		
		int resultado = calculadora.restar(x, y, z);
		
		int esperado = -10;
		
		assertEquals(esperado, resultado);
	}

}
