package Phase1_assessment3;


import java.util.LinkedList;
import java.util.Queue;

public class PP9_Queue {

	public static void main(String[] args) {
		Queue<Integer> locationsQueue = new LinkedList();
		
		locationsQueue.add(1);
		locationsQueue.add(2);
		locationsQueue.add(3);
		locationsQueue.add(4);
		locationsQueue.add(5);
		locationsQueue.add(6);
		locationsQueue.add(7);
		locationsQueue.add(8);
		
		
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
		

	}

}
