package examples;

import designPatterns.*;
import designPatterns.Builder.BuilderImp;
import userInterface.crStation;
import userInterface.frStation;
import userInterface.usStation;

public class mainClass {

	public static void main(String[] args) {
		
		//Ejemplo de uso de la Clase Singleton
		/*Singleton nueva = Singleton.getInstance();
		Singleton nueva2 = Singleton.getInstance();
		
		System.out.println(nueva.getName());
		System.out.println(nueva2.getNumber());*/
		
		//Ejemplo de uso de la Clase Facade
		/*Facade nuevo = Facade.getInstance();
		nuevo.drawShape(0);
		nuevo.drawShape(1);
		nuevo.drawShape(2);*/
		
		//Ejemplo de uso de la Clase Observer
		/*Subject subject = new Subject();
		
		new crStation(subject);
		new usStation(subject);
		new frStation(subject);
		
		System.out.println("\n Primer Envio de Mensaje: 15 \n");
		subject.setState(15);
		System.out.println("\n Segundo Envio de Mensaje: 10 \n");
		subject.setState(10);*/
		
		//Ejemplo de uso de la Clase Builder
		
		Builder helado = new BuilderImp(3).addChocolate(true).addStrawberry(true).addVanilla(true).build();
	}

}
