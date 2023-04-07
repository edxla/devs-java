package polimorfismo;

public class Rectangulo extends figuras implements Dibujable {
	private double base;
	private double altura;
	
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public void dibujar() {
		System.out.println("DIbujando Rectangulo");
		
	}
	
	
	
	

	
	
	

}
