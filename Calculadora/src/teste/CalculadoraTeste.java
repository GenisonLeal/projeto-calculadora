package teste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTeste {

	private Calculadora calculadora;

	@BeforeEach
	void setUp() {
		calculadora = new Calculadora();
	}

	// --- Testes para Soma ---
	@Test
	@DisplayName("Deve somar dois números positivos corretamente")
	void testSomarPositivos() {
		assertEquals(5.0, calculadora.somar(2.0, 3.0), "Soma de 2 + 3 deve ser 5");
	}

	@Test
	@DisplayName("Deve somar um número positivo e um negativo")
	void testSomarPositivoNegativo() {
		assertEquals(-1.0, calculadora.somar(2.0, -3.0), "Soma de 2 + (-3) deve ser -1");
	}

	@Test
	@DisplayName("Deve somar dois números negativos")
	void testSomarNegativos() {
		assertEquals(-5.0, calculadora.somar(-2.0, -3.0), "Soma de -2 + (-3) deve ser -5");
	}

	@Test
	@DisplayName("Deve somar um número com zero")
	void testSomarComZero() {
		assertEquals(2.0, calculadora.somar(2.0, 0.0), "Soma de 2 + 0 deve ser 2");
		assertEquals(0.0, calculadora.somar(0.0, 0.0), "Soma de 0 + 0 deve ser 0");
	}

	// --- Testes para Subtração ---
	@Test
	@DisplayName("Deve subtrair dois números positivos")
	void testSubtrairPositivos() {
		assertEquals(-1.0, calculadora.subtrair(2.0, 3.0), "Subtração de 2 - 3 deve ser -1");
		assertEquals(1.0, calculadora.subtrair(3.0, 2.0), "Subtração de 3 - 2 deve ser 1");
	}

	@Test
	@DisplayName("Deve subtrair um número negativo de um positivo")
	void testSubtrairNegativoDePositivo() {
		assertEquals(5.0, calculadora.subtrair(2.0, -3.0), "Subtração de 2 - (-3) deve ser 5");
	}

	@Test
	@DisplayName("Deve subtrair um número positivo de um negativo")
	void testSubtrairPositivoDeNegativo() {
		assertEquals(-5.0, calculadora.subtrair(-2.0, 3.0), "Subtração de -2 - 3 deve ser -5");
	}

	@Test
	@DisplayName("Deve subtrair dois números negativos")
	void testSubtrairNegativos() {
		assertEquals(1.0, calculadora.subtrair(-2.0, -3.0), "Subtração de -2 - (-3) deve ser 1");
	}

	@Test
	@DisplayName("Deve subtrair zero de um número")
	void testSubtrairZeroDeNumero() {
		assertEquals(2.0, calculadora.subtrair(2.0, 0.0), "Subtração de 2 - 0 deve ser 2");
	}

	@Test
	@DisplayName("Deve subtrair um número de zero")
	void testSubtrairNumeroDeZero() {
		assertEquals(-2.0, calculadora.subtrair(0.0, 2.0), "Subtração de 0 - 2 deve ser -2");
	}

	// --- Testes para Multiplicação ---
	@Test
	@DisplayName("Deve multiplicar dois números positivos")
	void testMultiplicarPositivos() {
		assertEquals(6.0, calculadora.multiplicar(2.0, 3.0), "Multiplicação de 2 * 3 deve ser 6");
	}

	@Test
	@DisplayName("Deve multiplicar um número positivo e um negativo")
	void testMultiplicarPositivoNegativo() {
		assertEquals(-6.0, calculadora.multiplicar(2.0, -3.0), "Multiplicação de 2 * (-3) deve ser -6");
	}

	@Test
	@DisplayName("Deve multiplicar dois números negativos")
	void testMultiplicarNegativos() {
		assertEquals(6.0, calculadora.multiplicar(-2.0, -3.0), "Multiplicação de -2 * (-3) deve ser 6");
	}

	@Test
	@DisplayName("Deve multiplicar um número por zero")
	void testMultiplicarPorZero() {
		assertEquals(0.0, calculadora.multiplicar(2.0, 0.0), "Multiplicação de 2 * 0 deve ser 0");
		assertEquals(0.0, calculadora.multiplicar(0.0, 3.0), "Multiplicação de 0 * 3 deve ser 0");
		assertEquals(0.0, calculadora.multiplicar(0.0, 0.0), "Multiplicação de 0 * 0 deve ser 0");
	}

	// --- Testes para Divisão ---
	@Test
	@DisplayName("Deve dividir dois números positivos")
	void testDividirPositivos() {
		assertEquals(2.0, calculadora.dividir(6.0, 3.0), "Divisão de 6 / 3 deve ser 2");
	}

	@Test
	@DisplayName("Deve dividir um número positivo por um negativo")
	void testDividirPositivoPorNegativo() {
		assertEquals(-2.0, calculadora.dividir(6.0, -3.0), "Divisão de 6 / (-3) deve ser -2");
	}

	@Test
	@DisplayName("Deve dividir um número negativo por um positivo")
	void testDividirNegativoPorPositivo() {
		assertEquals(-2.0, calculadora.dividir(-6.0, 3.0), "Divisão de -6 / 3 deve ser -2");
	}

	@Test
	@DisplayName("Deve dividir dois números negativos")
	void testDividirNegativos() {
		assertEquals(2.0, calculadora.dividir(-6.0, -3.0), "Divisão de -6 / (-3) deve ser 2");
	}

	@Test
	@DisplayName("Deve dividir zero por um número")
	void testDividirZeroPorNumero() {
		assertEquals(0.0, calculadora.dividir(0.0, 3.0), "Divisão de 0 / 3 deve ser 0");
	}

	@Test
	@DisplayName("Deve lançar exceção ao dividir por zero")
	void testDividirPorZero() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			calculadora.dividir(5.0, 0.0);
		});
		assertEquals("Divisão por zero não é permitida.", exception.getMessage());
	}
}