package learn_stack;
import java.util.*;
public class basics {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		//Add elements in a stack
		animals.push("Lion");
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println(animals);
		
		//Peek element
		System.out.println(animals.peek());
		
		//Remove an element
		System.out.println(animals.pop());
		System.out.println(animals);

	}

}
