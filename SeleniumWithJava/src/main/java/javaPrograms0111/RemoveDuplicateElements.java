package javaPrograms0111;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		//List<String> list1= new ArrayList<>();
		
		//list1.add("Ram");
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(4);
		System.out.println("Before" +list);
		
		
		Set<Integer> set= new LinkedHashSet<>(list);
		list.clear();
	list.addAll(set);
	System.out.println("After" +list);
		
		
	}
}
