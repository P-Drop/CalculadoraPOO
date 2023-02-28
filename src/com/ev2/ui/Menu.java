package com.ev2.ui;

import java.util.Scanner;

import com.ev2.main.Calculadora;


public class Menu  {
	

	static Scanner keyboard = new Scanner(System.in);
	public static void menuPrincipal() {
		boolean salir = false;
		
		while(!salir) {
		System.out.println("\n\n\tCALCULADORA");
		System.out.println("\n\t1. Suma");
		System.out.println("\t2. Resta");
		System.out.println("\t3. Multiplicación");
		System.out.println("\t4. División");
		System.out.println("\t5. Resto");
		System.out.println("\t6. Exponencial");
		System.out.println("\t7. Salir");
		System.out.print("\n  ¿Qué operación? -> ");
		int opcion = keyboard.nextInt();
		
		switch (opcion) {
		case 1 -> {
			System.out.print("Introduce el primer sumando -> ");
			int n1 = keyboard.nextInt();
			System.out.print("Introduce el segundo sumando -> ");
			int n2 = keyboard.nextInt();
			Calculadora s = new Calculadora (n1, n2);
			s.suma();
		}
		case 2 -> {
			System.out.print("Introduce el primer restando -> ");
			int n1 = keyboard.nextInt();
			System.out.print("Introduce el segundo restando -> ");
			int n2 = keyboard.nextInt();
			Calculadora r = new Calculadora (n1, n2);
			r.resta();
		}
		case 3 -> {
			System.out.print("Introduce el primer factor -> ");
			int n1 = keyboard.nextInt();
			System.out.print("Introduce el segundo factor -> ");
			int n2 = keyboard.nextInt();
			Calculadora m = new Calculadora (n1, n2);
			m.multiplicacion();
		}
		case 4 -> {
			System.out.print("Introduce el dividendo -> ");
			int n1 = keyboard.nextInt();
			System.out.print("Introduce el divisor -> ");
			int n2 = keyboard.nextInt();
			Calculadora d = new Calculadora (n1, n2);
			d.division();
		}
		case 5 -> {
			System.out.print("Introduce el dividendo -> ");
			int n1 = keyboard.nextInt();
			System.out.print("Introduce el divisor -> ");
			int n2 = keyboard.nextInt();
			Calculadora res = new Calculadora (n1, n2);
			res.resto();
		}
		case 6 -> {
			System.out.print("Introduce la base -> ");
			int n1 = keyboard.nextInt();
			System.out.print("Introduce el exponente -> ");
			int n2 = keyboard.nextInt();
			Calculadora e = new Calculadora (n1, n2);
			e.exponencial();
		}
		case 7 -> {
			salir = true;
		}
		default -> {
			System.err.println("ERROR: Opción no válida");
		}
		}
		
		}
		System.out.println("\t¡Hasta luego!");
	}
	
}
