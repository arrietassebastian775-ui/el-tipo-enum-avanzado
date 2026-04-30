		
		/*Los enumerables, al igual que las clases, tambien pueden contener constructores, 
    	 * campos (propiedades o atributos) y metodos.
    	 * 
    	 * A modo de ejemplo:
    	 * 
    	 * Supongamos un zoo ficticio que quiere conocer la frecuencia o afluencia de visitantes segun
    	 * la epoca del año.
    	 * 
    	 * IMPORTANTE!!! 
    	 * 
    	 * Cuando un enum va a contener algo mas que no sean las contanstes, todo tiene que ir despues
    	 * de las contantes separado por punto y coma*/

package com.example;

public enum Season {
	
	SPRING("Media") {
		
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "desde las 9:00 hasta las 17:00 horas";
		}
	},
	WINTER("Baja") {
		
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "desde las 10:00 hasta las 15:00 horas";
		}
	},
	SUMMER("Alta") {
		
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "desde las 9:00 hasta las 19:00 horas";
		}
	},
	FALL("Media") {
		
		@Override
		public String getHours() {
			// TODO Auto-generated method stub
			return "desde las 9:00 hasta las 17:00 horas";
		}
	};
	
	private final String expectedVisitors;

	private Season(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
		
	}
	
	/* Establecer el horario de visitas al Zoo segun la epoca del año */
	
	public abstract String getHours();

}
