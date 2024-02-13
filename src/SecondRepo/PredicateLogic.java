package SecondRepo;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import SecondRepo.PredicateEmp;
public class PredicateLogic {

	public static Predicate<PredicateEmp> isAdultMale(){
		return i -> i.getAge() > 18 && i.getGender().equalsIgnoreCase("M");
	}
	
	public static Predicate<PredicateEmp> isAdultFemale(){
		return i -> i.getAge() > 18 && i.getGender().equalsIgnoreCase("F");
	}
	
	//write a code for employee whose age is more than a given number
	
	public static Predicate<PredicateEmp> calculateAge(Integer age){
		return i -> i.getAge() > age;
	}
	
	public static Predicate<PredicateEmp> nameStartWith(){
		return i -> i.getFirstName().startsWith("Abhishek") && i.getFirstName().endsWith("singh");
	}
	
	
//	public  List<PredicateEmp> filterEmployees(List<PredicateEmp> emp, Predicate<PredicateEmp> predicate){
//	
//	return emp.stream().filter(predicate).collect(Collectors.<PredicateEmp>toList());
//}
}
