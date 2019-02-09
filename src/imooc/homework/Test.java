package imooc.homework;

public class Test {
	public static void main(String[] args) {
		Employee[] employees = new Employee[6];
		Department hr = new Department("D001", "人事部");
		Department market = new Department("D002", "市场部");
		Job manager = new Job("J001", "经理");
		Job assistant = new Job("J002", "助理");
		Job clerk = new Job("J003", "职员");
		employees[0] = new Employee("张铭", "S001", "男", 29, market, manager);
		employees[1] = new Employee("李艾爱", "S002", "女", 21, market, assistant);
		employees[2] = new Employee("孙超", "S004", "男", 29, market, clerk);
		employees[3] = new Employee("张美美", "S005", "女", 26, hr, clerk);
		employees[4] = new Employee("蓝迪", "S006", "男", 37, hr, manager);
		employees[5] = new Employee("米莉", "S007", "女", 24, hr, clerk);
		
		for (Employee e : employees) {
			System.out.println(e);
		}
		System.out.println(hr + "总共有" + Department.numberOfEmployees(hr.getName(), employees) + "名员工");
		System.out.println(market + "总共有" + Department.numberOfEmployees(market.getName(), employees) + "名员工");
	}
}
