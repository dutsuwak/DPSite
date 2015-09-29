package userInterface;

import designPatterns.Observer;
import designPatterns.Subject;

public class crStation extends Observer{
	
	public crStation(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("*Estación CR* Mensaje Recibido: " + subject.getState());
	}
}
