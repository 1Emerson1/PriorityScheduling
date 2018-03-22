import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Scheduling {
	
	static Queue<Process> pQueue = new PriorityQueue<Process>();
	private static final int arrTime = 0;
	
	public static void schedule(ArrayList<Process> fpsArray) {
		
		// compare two processes
		for(int i=0; i<fpsArray.size(); i++) {
			//System.out.println(pQueue.peek());
			System.out.println("i is " + i);
			
			for(int j=1; j<fpsArray.size(); j++) {
				
				System.out.println("j is " + j);
				
				// if priority are both comparing processes
				// are equal use fcfs
				/*if(fpsArray.get(i).getPriority() > (fpsArray.get(j).getPriority())) {
					if(fpsArray.get(i).getPriority() == (fpsArray.get(j).getPriority())) {
						pQueue.add(fpsArray.get(i));
					}
				} else {
					
				}*/
			}
		}
	}
	
	public static void gentWait(ArrayList<Process> fpsArray) {
		for(int i=0; i<fpsArray.size(); i++) {
			fpsArray.get(i).setWait(
					fpsArray.get(i).getBurst() - arrTime);
		}
	}
	
	public static String prtResult() {
		return pQueue.toString();
	}
	
}
