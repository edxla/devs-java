package lambdas.customs;

public class PruebaCalculable {
	public static void main(String[] args) {
		//Creacion con clases anoimas
		
		
		@SuppressWarnings("unused")
		Calculable cal=new Calculable() {
			
			//Clase Anonima
			@Override
			// average puede recibir n datos
			public double avg(double... numbers) {
				double sum = 0.0;
				for (int i = 0; i < numbers.length; i++) {
					sum+=numbers[i];
				}
				
				return sum / numbers.length;
			}
		};
		//lamda se peude poner double ...numbers o solo numbers
		Calculable calc=(numbers)->{
			double sum = 0.0;
			for (int i = 0; i < numbers.length; i++) {
				sum+=numbers[i];
			}
			
			return sum / numbers.length;
			
		};
		
		
		
		System.out.println(calc.avg(10,20,30));
	}
	
	

}
