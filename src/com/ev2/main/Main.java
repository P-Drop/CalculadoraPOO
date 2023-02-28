package com.ev2.main;
/*
 * 
 * @autor Pedro R
 * @descripcion Ejemplo de calculadora aplicando los conocimientos de POO. La clase Main hereda a la clase Menu (paquete com.ev2.ui) y esta importa la clase Calculadora
 * 				donde se crean objetos para cada operacion (los números como atributo y la operación como método de clase)
 * 
 *  			EV 2 Programación Orientada a Objetos
 * 
 */

import com.ev2.ui.Menu;

public class Main extends Menu{

	public static void main(String[] args) {
		menuPrincipal();
	}
}
