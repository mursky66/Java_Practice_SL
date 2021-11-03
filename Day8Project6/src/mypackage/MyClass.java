package mypackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyClass
{

	public static void main(String[] args) 
	{
		Queue<String> mq = new PriorityQueue<String>();
		
		mq.add("Robin");
		mq.add("Sky");
		mq.add("Love");
		mq.add("Khush");
		
		System.out.println(mq.poll());
	}

}
