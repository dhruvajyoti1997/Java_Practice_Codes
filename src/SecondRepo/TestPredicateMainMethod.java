package SecondRepo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import SecondRepo.PredicateEmp;
import SecondRepo.PredicateLogic;
public class TestPredicateMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PredicateEmp e1 = new PredicateEmp(1,23,"M","Abhishek","kumar");
		PredicateEmp e2 = new PredicateEmp(2,18,"F","Abhishek","singh");
		PredicateEmp e3 = new PredicateEmp(3,19,"F","Asmita","pathak");
		PredicateEmp e4 = new PredicateEmp(4,14,"M","Rishab","kumar");
		PredicateEmp e5 = new PredicateEmp(5,12,"M","Dhruva","pramanik");
		PredicateEmp e6 = new PredicateEmp(6,9,"F","Mehuli","bhattacharya");
		PredicateEmp e7 = new PredicateEmp(7,20,"F","Meghna","das");
		
		List<PredicateEmp> emp = new ArrayList<>();
		emp.addAll(Arrays.asList(new PredicateEmp[] {e1,e2,e3,e4,e5,e6,e7}));
		
		 filterEmployees( emp,PredicateLogic.isAdultFemale() );

		
		
	}

	public static  List<PredicateEmp> filterEmployees(List<PredicateEmp> emp, Predicate<PredicateEmp> predicate){
	
	return emp.stream().filter(predicate).collect(Collectors.<PredicateEmp>toList());
}

	



	

}
