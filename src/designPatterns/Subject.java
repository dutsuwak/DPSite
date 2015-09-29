package designPatterns;

import dataStructures.LinkedList;
import dataStructures.Node;

public class Subject {
	private LinkedList<Observer> observers = new LinkedList<Observer>();
	private int state;

	public int getState() {
	   return state;
	}

	public void setState(int state) {
	   this.state = state;
	   notifyAllObservers();
	}

	public void attach(Observer observer){
	   observers.insertTail(observer);		
	}

	public void notifyAllObservers(){
		Node<Observer> iterator = observers.getHead();
		for(int i = 0; i < observers.length(); i++){
			Observer temp = iterator.getData();
			temp.update();
			iterator = iterator.getNext();
		}
	}
}
