package designPatterns;

/**
 * Clase Singleton
 * Garantiza la existencia de una única instancia para la clase y la creación de un medio 
 * de acceso global a la instancia. Bloquea la instanciación de una clase o valor de un tipo 
 * a un único objeto.
 * @author fasm22
 *
 */
public class Singleton {
	
	private static Singleton singleInstance;
	
	int _number;
	String  _name;
	
	private Singleton(){
		_number = 0;
		_name = "This is a Singleton class";
	}
	
	public static Singleton getInstance(){
		if(singleInstance == null){
			singleInstance = new Singleton();
			return singleInstance;
		}
		else{
			return singleInstance;
		}
	}
	
	public int getNumber() { return _number; }
	public void setNumber(int pNumber) { _number = pNumber;}
	public String getName() { return _name; }
	public void setName(String pName) { _name = pName;}
	
}
