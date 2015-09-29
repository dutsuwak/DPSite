package userInterface;

import designPatterns.Observer;
import designPatterns.Subject;

public class frStation extends Observer{
	
	public frStation(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("*Français station* Message reçu: " + subject.getState());
	}
}
