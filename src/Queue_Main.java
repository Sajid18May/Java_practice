import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(13);
		pq.add(14);
		pq.add(15);
		pq.offer(23);
		Iterator <Integer>Io= pq.iterator();
		while(Io.hasNext()) {
		System.out.println(Io.next());
		}
		System.out.println("******");
		Deque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(12);
		dq.add(13);
		dq.add(14);
		dq.add(15);
		dq.offerFirst(23);
		for(Integer i:dq) {
			System.out.println(i);
		}
	}

}
