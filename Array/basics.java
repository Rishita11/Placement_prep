package learn_array;
import java.util.ArrayList;
import java.util.*;
public class basics {
      public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
        students.add("Rakesh");
        students.add("Riya");
        students.add("Suraj");
        students.add("Unati");
        System.out.println(students);
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
	}

}
