package org.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Collection1 {
	public static void main(String[] args) {
		System.out.println("***linked list***");
		
		List <Object> li=new LinkedList <Object> ();
		
		li.add(10);
	    li.add("obj");
		li.add(12.4);
	
	    System.out.println(li);
	    int size=li.size();
	    System.out.println("Size of the list:" +size);
	    Object object=li.get(2);
	    System.out.println("Index value of 0 is:"+object);
	    li.set(0, 100);
	    System.out.println("Set value is:"+li);
		li.remove(0);
		System.out.println("Removed value is:"+li);
		int indexOf=li.indexOf(12.4);
		System.out.println("Index of 12.4 :"+indexOf);
		boolean contains=li.contains(10);
		System.out.println("Contains :"+contains);
		List<Integer>li1=new LinkedList<Integer>();
		li1.add(10);
		li1.add(200);
		li1.add(300);
		li.addAll(li1);
		System.out.println(li);
		li.retainAll(li1);
		System.out.println(li);
		li.removeAll(li1);
		System.out.println(li);
		boolean empty=li.isEmpty();
		System.out.println("The list is empty or not:"+empty);
		boolean equals=li.equals(li1);
		System.out.println("li=li1:"+equals);
		
		
	}

}
