package imooc.homework;

/**
 * Job represents jobs of company
 * @author likejun
 *
 */
public class Job {
	public Job(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	private String id;
	private String name;
}
