package arreglos;

class Tacos
{
	private String sabor;
	private float precio;
	private boolean cebolla;
	private boolean cilantro;
	public Tacos(String sabor, float precio, boolean cebolla, boolean cilantro) {
		super();
		this.sabor = sabor;
		this.precio = precio;
		this.cebolla = cebolla;
		this.cilantro = cilantro;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public boolean isCebolla() {
		return cebolla;
	}
	public void setCebolla(boolean cebolla) {
		this.cebolla = cebolla;
	}
	public boolean isCilantro() {
		return cilantro;
	}
	public void setCilantro(boolean cilantro) {
		this.cilantro = cilantro;
	}
	
	
}

public class EjemploArreglosDeObjetosImplicito {
	public static void main(String[] args) {
		
		//anonima Tacos orden[] = new Tacos []{new Tacos
		Tacos orden[] = new Tacos []{new Tacos("Suadero",12.0f,true,true),
				new Tacos("Pastor",10.0f,true,true),
				new Tacos("Arrachera",20.0f,true,true)};
		
		
		//Orden 2 Multidimencional arreglo de objetos
		@SuppressWarnings("unused")
		Tacos orden1[][] = { {new Tacos("Pastor",10.0f,true,true) },
				{ new Tacos("Arrachera",20.0f,true,true), new Tacos("Arrachera",20.0f,true,true)}};
		
		float cuenta=0.0f;
		
		for (Tacos tacos : orden) {
			System.out.println("Sabor "+tacos.getSabor());
			System.out.println("Sabor "+tacos.getPrecio());
			System.out.println("Sabor "+tacos.isCebolla());
			System.out.println("Sabor "+tacos.isCilantro());
			System.out.println("\n");
			cuenta+=tacos.getPrecio();
		}
		System.out.println("Cuenta Total : "+cuenta);
		
		

	}

}
