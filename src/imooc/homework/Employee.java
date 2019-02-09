package imooc.homework;

/**
 * Employee represents employee info
 * @author likejun
 *
 */
public class Employee {
	public Employee(String name, String id, String sex, int age, Department department, Job job) {
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.age = age;
		this.department = department;
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getID() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	/**
	 * set age, must between 18 and 65
	 * @param age age of employee
	 */
	public void setAge(int age) {
		if (age >= 18 && age <= 65) {
			this.age = age;
		} else {
			this.age = 18;
		}
	}
	
	public String getSex() {
		return sex;
	}
	
	/**
	 * set sex, must be 男 or 女
	 * @param sex gender of employee
	 */
	public void setSex(String sex) {
		if (sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		} else {
			this.sex = "男";
		}
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department d) {
		department = d;
	}
	
	public Job getJob() {
		return job;
	}
	
	public void setJob(Job j) {
		job = j;
	}
	
	public String toString() {
		return String.format("姓名：%s\n工号：%s\n性别：%s\n年龄：%d\n职务：%s%s\n==========",
				name, id, sex, age, department, job);
	}
	
	private String name;
	private String id;
	private int age;
	private String sex;
	private Department department;
	private Job job;
}
