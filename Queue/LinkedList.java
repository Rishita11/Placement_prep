package learn_queue;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		Queue<Integer> pq=new LinkedList<>();
	      
	      pq.offer(40);
	      pq.offer(50);
	      pq.offer(60);
	      pq.offer(30);
	      System.out.println(pq);
	      
	      //remove an element
	      pq.poll();
	      System.out.println(pq);
	      
	      //Peek the top element
	      System.out.println(pq.peek());

	}

}
