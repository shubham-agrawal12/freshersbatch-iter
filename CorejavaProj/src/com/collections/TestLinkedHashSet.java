package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
	
	private static void testHashSet() {
		Set<String> hset = new HashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		hset.add("XYZ");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	private static void testLinkedHashSet() {
		Set<String> hset = new LinkedHashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		hset.add("XYZ");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		testLinkedHashSet();

	}

}
