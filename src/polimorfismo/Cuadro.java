package polimorfismo;

public class Cuadro extends figuras{
	private double lado;

	public Cuadro(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	
	

}
