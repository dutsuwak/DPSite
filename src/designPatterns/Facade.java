package designPatterns;

import userInterface.consoleDisplay;

/**
 * Facade
 * Provee una interfaz única y sencilla para acceder a una interfaz o grupo de interfaces de un subsistema.
 * @author fasm22
 *
 */
public class Facade {
	
	private static Facade facade;
	boolean inUse;
	
	//Variables de Ambiente Controladas por el Facade
	
	//Interfaz Gráfica
	private consoleDisplay console;
	
	private Facade(){
		inUse = true;
		console = new consoleDisplay();
	}
	
	public static Facade getInstance(){
		if(facade == null){
			facade = new Facade();
			return facade;
		}
		else{
			return facade;
		}
	}
	
	public void drawInConsole(String pInfo){
		console.printInScreen(pInfo);
	}
	public void drawShape(int pShapeNumber){
		if(pShapeNumber == 0){
			console.printSquare();
		}
		else if(pShapeNumber == 1){
			console.printCircle();
		}
		else if(pShapeNumber == 2){
			console.printTriangle();
		}
	}
}
