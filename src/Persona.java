//import javax.print.DocFlavor.STRING;

class Persona { //Plantilla
    //atributos son caracteristicas
    String nombre;
    int edad;
    char genero;
    

    Persona() //Constructor sin inicializar 
    {
    	this("Nombre",22,'M');
    	System.out.println("COnstructor por defecto");

    }

    Persona(String nombre, int edad, char genero) 
    {
    	//Imprimor instructor vacio
    	//this();
        //contructor iinicializando paremetos
        this.nombre=nombre;
        this.edad = edad;
        this.genero=genero;
    }

    //Metodos recibienndo parametros
    // void no hay valores de retorno

    void jugarVideoJuegos(Persona p)
    {
        System.out.println(nombre+" Esta junagdo con "+p.nombre);
    }

    //metodos acciones que yo puedo hacer
    //Los métodos van a definir un valor de retorno espacio y el nombre del método va a llevar//
    void imprimirInformacion()
    {
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Genero : " + genero);

    }
    public static void main(String[] args) {
        //Constructor
        Persona p=new Persona("Alex",32,'M');
        p.imprimirInformacion();

        Persona p1 = new Persona("Juan",51,'M');
        p1.imprimirInformacion();

        p.jugarVideoJuegos(p1);
        
        new Persona().imprimirInformacion();
    }
}
