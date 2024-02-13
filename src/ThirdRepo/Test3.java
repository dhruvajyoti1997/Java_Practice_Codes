package ThirdRepo;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import EmpDetails.Employee;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> li = new ArrayList<>();
 
 li.add(2);
 li.add(3);
 li.add(4);
 li.add(2);
 
 //long res =li.stream().filter(e -> e.equals(2)).count();
 
 li.stream().filter( e -> e == 3).forEach(e -> System.out.println("true"));
 
// System.out.println(res);
 //JAVA 8 Questions
 // https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
 ArrayList<Employee> details = new ArrayList<>();
 
 details.add(new Employee(101, "dhruva","M", 20, 30000, 24));
 details.add(new Employee(102, "Ravi","M", 27, 40000, 22));
 details.add(new Employee(106, "Shiva","M", 27, 40000, 25));
 details.add(new Employee(107, "mavi","F", 29, 40000, 20));
 details.add(new Employee(108, "Soni","F", 20, 40000, 26));
 details.add(new Employee(103, "Majid","M", 29, 50000, 32));
 details.add(new Employee(104, "Riya","F", 26, 60000, 54));
 
 Map<Integer, List<Employee>> getempdetails=details.stream().collect(Collectors.groupingBy(Employee :: getDeptid, Collectors.toList()));

 getempdetails.entrySet().forEach( e -> {
	 System.out.println(e.getKey() + "---"+ e.getValue());
 });
 
 Map<Integer, Long> count_details= details.stream().collect(Collectors.groupingBy(Employee :: getDeptid , Collectors.counting()));
 
 count_details.entrySet().forEach(e -> {
	 System.out.println("dept count ---->>>>"+e.getKey() + "---"+ e.getValue());
 });
 
 details.stream().map(Employee :: getDeptid).distinct().forEach(System.out :: println);
Optional<Employee> sal = details.stream().collect(Collectors.maxBy(Comparator.comparing(Employee :: getSalary)));

System.out.println("sal"+sal);
	
Map<String, Double> getAvgAge =details.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingInt(Employee :: getAge)));

	System.out.println("avg age of all employees ---> "+getAvgAge);
	
	Optional<Employee> minAge=	details.stream().filter(e -> e.getGender() == "F" ).collect(Collectors.minBy(Comparator.comparing(Employee :: getAge)));
	
	System.out.println("min Age --->"+minAge);
	
	
	}

}
