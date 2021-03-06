package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestData {

	public static List<Fruit> getAllFruits() {
		List<Fruit> fruits = new ArrayList<Fruit>();
		fruits.add(new Fruit("Peach", 90, 50, "Red"));
		fruits.add(new Fruit("Banana", 200, 10, "Yellow"));
		fruits.add(new Fruit("Pomegranate", 200, 70, "Red"));
		fruits.add(new Fruit("Apple", 300, 150, "Red"));
		fruits.add(new Fruit("Watermelon", 30, 20, "Red"));
		return fruits;
	}
	public static void printFruits(List<Fruit> fruits) {
		 fruits.stream().filter(fruit->fruit.getCalories()<100)
		 .sorted(Comparator.comparing(Fruit::getCalories).reversed())
		 .collect(Collectors.toList())
		 .forEach(System.out::println);;
		//fruits.stream().forEach(System.out::println);
		/* fruits.stream().filter(fruit->fruit.getColor().equals("Red"))
		 .sorted(Comparator.comparing(Fruit::getColor))
		 .collect(Collectors.toList())
		 .forEach(System.out::println);;
		 */
		 
		 
	}

	public static List<News> getAllNews() {
		List<News> newsList = new ArrayList<News>();
		newsList.add(new News(1, "Tom", "Anand", "Very nice article on budget"));
		newsList.add(new News(2, "Ivan", "Bipin", "Good budget description"));
		newsList.add(new News(1, "Tom", "Narang", "How can you write such an article?"));
		newsList.add(new News(2, "Jerry", "Mitul", "I agree with you!!"));
		newsList.add(new News(2, "James", "Anand", "This seems to be paid news for glorifying the budget"));
		newsList.add(new News(3, "Sara", "Daji", "Good article"));
		return newsList;
	}
	public static void printNews(List<News> newsList) {
		Map<Integer, Long> result=newsList.stream()
		.collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
		Map<String, Long> result1=newsList.stream()
				.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
		
		System.out.println(result);
		
		//newsList.stream().forEach(System.out::println);
	}

	public static List<Transaction> getAllTransactions() {
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(new Transaction(new Trader("Anand", "Pune"), 2016, 10000));
		transactions.add(new Transaction(new Trader("Neeraja", "Indore"), 2015, 25000));
		transactions.add(new Transaction(new Trader("Yog", "Mumbai"), 2011, 33000));
		transactions.add(new Transaction(new Trader("Lokesh", "Nagpur"), 2016, 200000));
		transactions.add(new Transaction(new Trader("Komal", "Pune"), 2011, 80000));
		transactions.add(new Transaction(new Trader("Ishwar", "Indore"), 2016, 12000));
		return transactions;
	}
	
	public static void printTransactions(List<Transaction> transactions) {
		
		List<String> traderCityList=transactions.stream().map(Transaction->Transaction.getTrader().getCity())
		.distinct()
		.collect(Collectors.toList());
		System.out.println(traderCityList);
		//transactions.stream().forEach(System.out::println);
	}
	public static void main(String args[])
	{
		//printFruits(getAllFruits());
		printNews(getAllNews());
		//printTransactions(getAllTransactions());
	}
}