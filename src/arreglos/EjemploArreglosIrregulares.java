package arreglos;

public class EjemploArreglosIrregulares {
	
	/*
	 * 10
	 * 10	20
	 * 30	40	50
	 * 50	50
	 */

	public static void main(String[] args) {
		int arreglo [][] = new int [4][];
		
		arreglo[0]=new int[1];//Arreglo  1 elemento
		arreglo[0][0]=10;
		
		arreglo[1]=new int[2];//Arregglo 2 elementos
		arreglo[1][0]=10;
		arreglo[1][1]=20;
		
		arreglo[2]=new int[3];//Arregglo 3 elementos
		arreglo[2][0]=30;
		arreglo[2][1]=40;
		arreglo[2][2]=50;
		
		arreglo[3]=new int[2];//Arregglo 2 elementos
		arreglo[3][0]=50;
		arreglo[3][1]=50;
		
		
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo[i].length; j++) {
				System.out.print(arreglo[i][j]+"\t");
			}
			System.out.println();
		}
		
		for (int[] is : arreglo) {
			for ( int is2 : is) {
				System.out.print(is2+"\t");
			}
			System.out.println();
		}
		
		
		

	}

}
