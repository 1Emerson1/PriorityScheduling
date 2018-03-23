public class Process {
	private int id;
	private int bTime;
	private int wTime;
	private int aTime;
	private int priority;
	
	// constructor for process
	public Process(int id, int priority, int bTime) {
		wTime = 0;
		aTime = 0;
		this.id = id;
		this.priority = priority;
		this.bTime = bTime;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public int getBurst() {
		return bTime;
	}
	
	public int getID() {
		return id;
	}
	
	public int getWait() {
		return wTime;
	}
	
	public int getAroundTime() {
		return aTime;
	}
	
	public void setWait(int wTime) {
		this.wTime = wTime;
	}
	
	public void setAroundTime(int aTime) {
		this.aTime = aTime;
	}
}
