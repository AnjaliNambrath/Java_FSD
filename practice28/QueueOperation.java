package practice28;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperation {
	Queue qu = new PriorityQueue();
	public String addelement(String name) {
		if(qu.size()<3) {
			qu.add(name);
			return "Element is added";
		}
		else {
			return "Queue is full/Overflow";
		}
		
	}
	public String removeelement() {
		if(qu.size()>0) {
			return (String) qu.remove();
		}
		else {
			return "Queue is Empty/Underflow";
		}
	}
	public int size() {
		return qu.size();
	}

}
