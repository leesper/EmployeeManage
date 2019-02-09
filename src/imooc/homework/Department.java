package imooc.homework;

/**
 * Department represents departments of company
 * @author likejun
 *
 */
public class Department {
	public Department(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/**
	 * return number of employees belong to some department
	 * @param name name of department
	 * @param employees array of employees
	 * @return
	 */
	public static int numberOfEmployees(String name, Employee[] employees) {
		if (name == null || employees == null) {
			return 0;
		}
		
		int count = 0;
		for (Employee e : employees) {
			if (e.getDepartment().getName().equals(name)) {
				count++;
			}
		}
		
		return count;
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
