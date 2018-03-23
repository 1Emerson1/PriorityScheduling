public class PriorityScheduling {
	public static void main(String[] args) {
		// add processes
		Process[] aryProcess = {
				new Process(7, 1, 5), new Process(6, 3, 3),
				new Process(1, 10, 1), new Process(4, 8, 6),
				new Process(2, 3, 5)};
		
		System.out.println("Priority Scheduling, sorting processes based on "
				+ "\npriority - lower priority number, higher the priority \n");
		System.out.println("----BEFORE PRIORITY SCHEDULING----");
		//print current array
		System.out.println("\n Process \t Priority \t Wait Time \t "
				+ "Turn Around Time \n");
		System.out.println(printArray(aryProcess));
		
		schedule(aryProcess);
		waitingTime(aryProcess);
		turnAround(aryProcess);
		
		System.out.println("----AFTER PRIORITY SCHEDULING----");
		//print result
		System.out.println("\n Process \t Priority \t Wait Time \t "
				+ "Turn Around Time \n");
		System.out.println(printArray(aryProcess));
	}
	
	//method to schedule process
	static void schedule(Process[] fpsArray) {
		
		// compare two processes
		for(int i=0; i<fpsArray.length; i++) {
			for(int j=i+1; j<fpsArray.length; j++) {
				// sorting processes based on priority
				// if priority are equal use FCFS
				if(fpsArray[i].getPriority() > (fpsArray[j].getPriority())) {
				
					/*System.out.println("P" + fpsArray[i].getID() + " [Priority-"
							+ fpsArray[i].getPriority() + "]"
							+ " > P" + fpsArray[j].getID()
							+ " [Priority-"
							+ fpsArray[j].getPriority() + "]");*/
					
					// swap elements
					Process temp = fpsArray[i];
					fpsArray[i] = fpsArray[j];
					fpsArray[j] = temp;
					
				} else if(fpsArray[i].getPriority() == (fpsArray[j].getPriority())) {
					if(fpsArray[i].getID() > fpsArray[j].getID()) {
						// swap elements
						Process temp = fpsArray[i];
						fpsArray[i] = fpsArray[j];
						fpsArray[j] = temp;
					}
					
				}
			}
		}
	}
	
	// method to find waiting time
	static void waitingTime(Process[] fpsArray) {
		final int arrTime = 0;
		for(int i=0; i<fpsArray.length; i++) {
			fpsArray[i].setWait(fpsArray[i].getBurst() - arrTime);
		}
	}
	
	// method to find turn around time
	static void turnAround(Process[] fpsArray) {
		for(int i=0; i<fpsArray.length; i++) {
			fpsArray[i].setAroundTime(fpsArray[i].getBurst() + fpsArray[i].getWait());
		}
	}
	
	// method to print array
	static String printArray(Process[] fpsArray) {
		String result = "";
		for(int i=0; i<fpsArray.length; i++)
			result = result + "\n "
					+ fpsArray[i].getID() + "\t\t"
					+ fpsArray[i].getPriority()+"\t\t"
					+ fpsArray[i].getWait()+"\t\t"
					+ fpsArray[i].getAroundTime()+"\n";
		return result;
	}
}
