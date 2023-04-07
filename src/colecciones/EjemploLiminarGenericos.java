package colecciones;
class Transporte
{
	
}

class Coche extends Transporte
{
	
}

class Deportivo extends Coche
{

}

class BeanGenericos<T extends Transporte>
{
	//T Object
	private T valor;

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public BeanGenericos(T valor) {
		super();
		this.valor = valor;
	}
	
	
}
public class EjemploLiminarGenericos {

	public static void main(String[] args) {
//		BeanGenericos<Transporte> bean = new BeanGenericos<>(new Transporte());
		@SuppressWarnings("unused")
		BeanGenericos<Coche> bean = new BeanGenericos<>(new Deportivo());
		//al poner un string y txt no heredan de transporte

	}

}
