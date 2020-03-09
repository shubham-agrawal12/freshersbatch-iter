package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

class User
{
	private String name;
	private String username;
	private String pass;
	
	public User(String name,String username,String pass)
	{
		this.name=name;
		this.username=username;
		this.pass=pass;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", pass=" + pass + "]";
	}

	
}






public class ChatApplication {
	private static Map<String, TreeSet<User>> hmapUsers = 
			new HashMap<String, TreeSet<User>>();
	private static Map<String, List<String>> hmapMessages = 
			new HashMap<String, List<String>>();

	public static void main(String[] args) {
		String ch="";
		while(ch!="N")
		{
		System.out.println("ChatApp");
		System.out.println("Options:\r\n" + 
				"A) Create a chatroom\r\n" + 
				"B) Add the user\r\n" + 
				"C) User login\r\n" + 
				"D) Send a message\r\n" + 
				"E) Display the messages from a specific chatroom\r\n" + 
				"F) List down all users belonging to the specified chat room.\r\n" + 
				"G) Logout\r\n" + 
				"H) Delete an user\r\n" + 
				"I) Delete the chat room.\r\n" + 
				"Please enter your option:\r\n" + 
				"");
		
		Scanner sc=new Scanner(System.in);
		ch=sc.next();
		
		switch(ch)
		{
		case "A":
			System.out.println("Enter chat room name");
			String room=sc.next();
			if(hmapUsers.containsKey(room))
			{
				System.out.println("chat room already exists");
			}
			else
			{
				hmapUsers.put(room,new TreeSet<User>());
				hmapMessages.put(room,new ArrayList<String>());
				System.out.println("Chatroom Created!!");
			}
			
			
			break;
		case "B":
			System.out.println("Enter chat room name");
			 String room1=sc.next();
			 if(hmapUsers.containsKey(room1)==true){
			System.out.println("Enter your Name");
			String name=sc.next();
			System.out.println("Enter your UserName");
			String username=sc.next();
			System.out.println("Enter your Password");
			String pass=sc.next();
			User a1=new User(name,username,pass);
			System.out.println(a1);
			 }
			 else
			 {
				 System.out.println("Invalid room");
			 }
			
		break;
		case "C":
			System.out.println("Enter your Name");
			String name=sc.next();
			System.out.println("Enter your UserName");
			String username=sc.next();
			System.out.println("Enter your Password");
			String pass=sc.next();
		//	User a2=new
			//if(name.equals(a1.getName()));
			
			break;
		case "D":
			break;
		case "E":
			break;
		case "F":
			break;
		case "G":
			break;
		case "H":
			break;
		case "I":
			break;
			default:
				break;
		}}
		
		

	}
	public static void testHashMap()
	{
		String name="shubham";
		
		
		
		
	}

}
