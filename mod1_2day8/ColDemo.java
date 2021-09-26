package mod1_2day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ColDemo {
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=100;
		
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("The size of array is..:"+arr.length);
		
		//ArrayList list=new ArrayList();
		List list=new LinkedList();
		//PROVE THIS - Assignment -
		Collections.synchronizedList(list);
		Collections.sort(list);
		System.out.println("The size of arraylist..:"+list.size());
		list.add(233);
		list.add(678);
		list.add(1234);
		list.add(999);
		//Check for more methods in collections class - Assignment
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		System.out.println("The size of arraylist..:"+list.size());
		list.remove(0);
		System.out.println("The size of arraylist..:"+list.size());
		
		for(Object o:list) {
			System.out.println(o);
		}
		System.out.println(list.get(0));
		
		//performance will good compared to for-loop
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//you cannot reuse a iterator
		while(iter.hasNext()) {
			System.out.println("..........."+iter.next());
		}
		//your iterator cursor can be moved back and forth
		ListIterator liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			
			System.out.println(liter.previous());
		}
		//you cannot reuse a list iterator
		while(liter.hasPrevious()) {
			System.out.println("*******************"+liter.previous());
		}
	}
}
class Dabba2{}
