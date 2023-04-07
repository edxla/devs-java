package arreglos;
//arreglos
public class EjemploArreglosUnidimencionales {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int edad = 20;
		int array[]=new int [3];
		array[0]=25;
		array[1]=20;
		array[2]=30;
		
		//Acceder al Arry
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		for(int i=0;i<array.length;i++) 
		{
			System.out.println(array[i]);
		}
		
		
		int i=0;
		while(i<array.length) 
		{
			System.out.println(array[i]);
			i++;
		}
		
		//for each--Toma el valor en cada iteracion
		
		for(int temp:array) 
		{
			System.out.println(temp);
		}
		

	}

}
