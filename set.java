package org.collection;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class set {
	public static void main(String[] args) {
		System.out.println("***Treeset***");
		Set<Object> li=new TreeSet<Object> ();
		li.add(10);
	    li.add(20.1);
		li.add(30);
	    System.out.println(li);
	    int size=li.size();
	    System.out.println("Size of the list:" +size);
	    li.remove(10);
		System.out.println("Removed value is:"+li);
		boolean contains=li.contains(10);
		System.out.println("Contains :"+contains);
		Set<Integer>li1=new TreeSet<Integer>();
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

	


