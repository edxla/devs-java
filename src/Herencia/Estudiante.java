package Herencia;

public class Estudiante extends Persona {
	
	int numeroDeCuenta;
	
	Estudiante(int numeroDeCuenta,String nombre, String fechaDeNacimiento)
	{
		super(nombre,fechaDeNacimiento);
		this.numeroDeCuenta=numeroDeCuenta;
	}
	@Override //Subre escribe un metodo de la clase padre
	void dormir()
	{
		super.dormir();//Metodo de la clase padre
		System.out.println("Soy "+ nombre +" Soy Estudiante, y yo no Duermo");
	}
	
	void aprobar() 
	{
		System.out.println("Soy "+nombre+" y aprobe mi examen");;
	}
	
	void reprobar() 
	{
		System.out.println("Soy "+nombre+" y reprobe mi examen");
	}
	

}
