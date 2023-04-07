package Modificadores.paquete2;

import Modificadores.paquete1.EjemploProtected;

//herencia
public class PruebaEjemploProtected extends EjemploProtected {
	void bar() 
	{
		foo();
	}
	public static void main(String[] args) {
		PruebaEjemploProtected e=new PruebaEjemploProtected();
		e.bar();
	}

}
