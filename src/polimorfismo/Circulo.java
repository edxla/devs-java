package polimorfismo;

public class Circulo extends figuras implements Dibujable {
	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	void rodar() 
	{
		System.out.println("EL circulo "+ getColor() +" esta rodando");
	}

	@Override
	public void dibujar() {
		System.out.println("DIbujando Circulo");
		
	}
	
	
	
	
	
	
	

}
