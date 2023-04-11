package com.dal.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaEg {
	public static void main(String args[])
	{
		/* Runnable r=new MyTaskThread();
		Thread thread=new Thread();
		thread.start(); */
	
		// Java 8
		/* Runnable r=()->
				{

						Task task=new Task();
						task.connect();
					
			
				};
				Thread t1=new Thread(r);
				t1.start(); */
		
		// Java 8 Syntax 2
		/* new Thread(()-> {
			new Task().connect();
		}).start(); */
		// Java 8 Syntax 3
		
		// new Thread(new Task()::connect).start();
		
		User u1=new User(01,"Ram","ram30@gmail.com");
		User u2=new User(02,"Syed","syed@gmail.com");
		User u3=new User(03,"Vasanth","vk@gmail.com");
		
		List<User> li=new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		System.out.println("User List :"+li);
		/* Iterator<User> i=li.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		} */
		
		li.forEach(lis->System.out.println(lis));
		}
		
	}
