package wrapper;

public class MetodosDeConversion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer x=10;
		double d=x.doubleValue();
		float f=x.floatValue();
		long l = x.longValue();
		
		String valor="10";
		int val=Integer.parseInt(valor);
		System.out.println(val);
		
		Double valueOf = Double.valueOf("55");
		System.out.println(valueOf);
		

	}

}
