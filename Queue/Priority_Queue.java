package learn_queue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class priority_queue {

	public static void main(String[] args) {
		//Max heap
      Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
      
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
