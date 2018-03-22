
public class Process {
	private int id;
	private int bTime;
	private int priority;
	
	public Process(int id, int priority, int bTime) {
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
}
