package learn_array;
import java.util.*;
public class ListAndArray {

	public static void main(String[] args) {
	  List<Integer> list =new ArrayList<>();
	  
	  //Adding elements in the list
	  list.add(0);
	  int index;
	  list.add(index=1,50);
	  System.out.println(list);
	  
	  //List operations
	  list.add(index=2, 30);
	  list.add(index=3, 45);
	  list.add(index=4, 15);
	  System.out.println(list);
	  
	  System.out.println(list.get(1));
	  System.out.println(list.remove(2));
	  System.out.println(list.remove(Integer.valueOf(30)));
	  
	  //Iterate through the list
	  for(int i=0;i<list.size();i++)
	  {
		  System.out.println("Element of the list: "+list.get(i));
	  }
	  
	  //Second way and most effective way
	  for(Integer i:list) {
		  System.out.println("Each element "+ i);
	  }
	  
	  //Third way
	  Iterator<Integer> it =list.iterator();
	  while(it.hasNext()) {
		  System.out.println("Iterator "+it.next());
	  }
	  
	  
	}

}
