package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
    	
    	// Frecuencia de visitantes al zoo en SPRING
    	
    	System.out.println("Frecuencia de visitantes al Zoo en primavera");
    	Season.SPRING.printExpectedVisitors();
    	
    	System.out.println("Frecuencia de visitantes al Zoo en verano");
    	Season.SUMMER.printExpectedVisitors();
    	
    	// Horario de visitas al Zoo en verano
    	
    	System.out.println("El horario de visitas al Zoo en verano es: " + Season.SUMMER.getHours());
    	
    		
    	}
    }

