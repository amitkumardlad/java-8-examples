package code.java8.interviewtask;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkArrayList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(85);
        list.add(15);
        list.add(4);
        list.add(20);
 
        System.out.println("Given Linked list"+list);
         list.stream().sorted().forEach(System.out::println);
        System.out.println("");
        Collections.reverse(list);
        System.out.println("Reversed linked list ");
        System.out.println(list);
        Iterator<Integer> itr = list.descendingIterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
	}

}
