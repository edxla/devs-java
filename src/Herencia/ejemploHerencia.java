package Herencia;

class Animal{
	String nombre;
	public void respirar() 
	{
		System.out.println("Soy un Animal y estoy respirando");
		
	}
	}

//Heredacin de ANimal
class Perro extends Animal{
	
}

class Gato extends Animal
{
	
	}

public class ejemploHerencia {
public static void main(String args []) 
{
	Animal a= new Animal();
	Perro p=new Perro();
	p.respirar();
	p.nombre="Rocky";
	Gato g=new Gato();
	g.respirar();
	
	//Instance OFF ( is A )Instancia = Ob  [Si un Objeto es un tipo de clase en especifico o subclase]
	System.out.println(a instanceof Animal);
	System.out.println(a instanceof Object);
	System.out.println(a instanceof Perro);
	System.out.println(a instanceof Gato);
	
	//Polimorfismo capacidad que tienen los objetos para ser identifficados como Otros
	System.out.println(p instanceof Animal);
	System.out.println(a instanceof Object);
	System.out.println(a instanceof Perro);
	//Un objeto p puede ser tratado de varias formas
	
}
}
