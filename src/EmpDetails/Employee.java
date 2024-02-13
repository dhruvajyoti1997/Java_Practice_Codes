package EmpDetails;

public class Employee {
private int empid;
private String name;
private String gender;
private int  deptid;
private int salary;
private int age;
public Employee(int empid, String name,String gender, int deptid, int salary, int age) {
	super();
	this.empid = empid;
	this.name = name;
	this.gender = gender;
	this.deptid = deptid;
	this.salary = salary;
	this.age = age;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getGender() {
	return gender;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ",  gender=" + gender + ", deptid=" + deptid + ", salary=" + salary + ",  age=" + age + "]";
}

	
}
