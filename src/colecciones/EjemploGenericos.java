package colecciones;

class BeanGenerico<T>
{
	//T Object
	private T valor;

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public BeanGenerico(T valor) {
		super();
		this.valor = valor;
	}
	
	
}
public class EjemploGenericos {

	public static void main(String[] args) {
		BeanGenerico<String> bean = new BeanGenerico<>("Alex");
		//al crear el obj T se define, y se considera como String
		System.out.println(bean.getValor());
		
		bean.setValor("Alice");
		System.out.println(bean.getValor());
		

	}

}
