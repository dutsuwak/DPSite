package userInterface;

import designPatterns.Observer;
import designPatterns.Subject;

public class usStation extends Observer{
	
	public usStation(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("*US Station* Message Received: " + subject.getState());
	}
}
