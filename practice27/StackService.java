package practice27;

import java.util.Stack;

public class StackService {
	Stack ss = new Stack();
	public String push(String name) {
		if(ss.size()<3) {
			ss.push(name);
			return "Element is pushed";
		}
		else {
			return "Stack is full/Overflow";
		}
		
	}
	public String pop() {
		if(ss.size()>0) {
			return (String) ss.pop();
		}
		else {
			return "Stack is Empty/Underflow";
		}
	}
	public int size() {
		return ss.size();
	}

}

