package polimorfismo;

public abstract class figuras {
	private String color;

	public figuras(String color) {
		super();
		this.color = color;
	}
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double calcularArea() 
	{
		return 0;
	}
	
	

}
