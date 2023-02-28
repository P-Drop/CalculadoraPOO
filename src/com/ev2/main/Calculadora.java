package com.ev2.main;

public class Calculadora {

	public int numero1;
	public int numero2;
	public int resultadoE;
	public double resultadoR;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public void suma() {
		resultadoE = numero1 + numero2;
		System.out.println("Resultado: "+resultadoE);
	}
	public void resta() {
		resultadoE = numero1 - numero2;
		System.out.println("Resultado: "+resultadoE);
	}
	public void multiplicacion() {
		resultadoE = numero1 * numero2;
		System.out.println("Resultado: "+resultadoE);
	}
	public void division() {
		resultadoR = (double)numero1 / (double)numero2;
		System.out.println("Resultado: "+resultadoR);
	}
	public void resto() {
		resultadoE = numero1 % numero2;
		System.out.println("Resultado: "+resultadoE);
	}
	public void exponencial() {
		resultadoR = Math.pow(numero1, numero2);
		System.out.println("Resultado: "+resultadoR);
	}
}
