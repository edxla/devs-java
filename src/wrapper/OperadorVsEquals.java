package wrapper;
class Perro{
	private String nombre;

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Perro) //vlidar si es intancia
		{
			
			Perro prr = (Perro)obj;
			if(prr.getNombre().equals(nombre))
			{
				return true;
			}else 
			{
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	
	
}
public class OperadorVsEquals {

	public static void main(String[] args) {
		Perro p=new Perro("Chabelita");
		Perro p1=new Perro("Chabelita");
		System.out.println(p.equals(p1));
		
		
		Integer x=10;
		Integer y=10;
		System.out.println(x.equals(y));
		System.out.println(x==y);

	}

}
