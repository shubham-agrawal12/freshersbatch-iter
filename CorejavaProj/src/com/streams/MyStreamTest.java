package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamTest {
	
	public static List<Fruit> getAllFruits()
	{
		List<Fruit> fruit=new ArrayList<Fruit>();
		fruit.add(new Fruit("Peach", 90, 50, "Red"));
		fruit.add(new Fruit("orange",50,60,"orange"));
		fruit.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruit.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruit.add(new Fruit("Apple", 300, 150, "Red"));
		fruit.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruit;
	}
	public static void printFruits(List<Fruit> fruits) {
		
		 fruits.stream().filter(fruit->fruit.getCalories()<100)
		 .sorted(Comparator.comparing(Fruit::getCalories).reversed())
		 .collect(Collectors.toList())
		 .forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFruits(getAllFruits());
	}

}
