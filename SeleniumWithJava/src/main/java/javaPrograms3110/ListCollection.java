package javaPrograms3110;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
public static void main(String[] args) {
	List<String> list=new ArrayList<>();
	list.add("Apple");
	list.add("Ball");
	list.add("Dog");
	list.add("Fish");
	list.add("Xerox");
	list.add("Zebra");
	System.out.println(list);
	list.add(2,"Added at index 2");
	System.out.println(list);
	list.contains("Dog");
	list.remove(2);
	System.out.println(list);
	System.out.println(list.get(3));
	int size=list.size();
	System.out.println("Total number of items in list = "+size);
	System.out.println( list.remove(0));
	System.out.println(list.remove("Zebra"));
	System.out.println(list.remove("Zera"));
	System.out.println(list);
	
	
}
}
