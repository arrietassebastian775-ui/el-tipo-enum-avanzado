package com.example;

public class App {
    public static void main(String[] args) {
    	
    	/*El enum tiene un metodo que se llama values, que permite iterar a travez de las constantes del enum
    	 * y mostrar el ordinal asiciado a dicha constante el nombre de tipo String de la propia constante*/
    	
    	// primero utilizando sentencia for mejorado
    	
    	for (Season season : Season.values()) {
    		System.out.println("Nombre de la constante: " + season.name() + ", ordinal: " + season.ordinal());
    	}
    	
    	// segundo utilizando operaciones de agregado

    }
}
