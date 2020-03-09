package com.java8features;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class LamdaHash {

	public static void main(String[] args) {

		Map<Integer,Double> hmap=new HashMap<Integer,Double>();
		hmap.put(1,10.0);
		hmap.put(2,20.0);
		hmap.put(3,30.0);
		hmap.put(4,40.0);
		hmap.put(5,50.0);
		hmap.put(6,60.0);
		hmap.put(7,70.0);
		Set<Entry<Integer,Double>> entries=hmap.entrySet();
		StringBuilder sb=new StringBuilder();
		Consumer<String> consumer=(String)->sb.append(String);
		for(Map.Entry<Integer, Double> entry: entries)
		{
			String key=entry.getKey().toString();
			consumer.accept(key);
			String Value=entry.getValue().toString();
			consumer.accept(Value);
		}
		System.out.println(sb);
	}

}
