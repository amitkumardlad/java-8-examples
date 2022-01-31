package code.java8.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestEmployee {

	public static void findYoungestEmployee(List<Employee> employeeList){
				
		if(!employeeList.isEmpty()){
			Optional<Employee> minEmployee = employeeList.stream().min( (a,b)-> Integer.compare(a.getAge(), b.getAge()));
			if(minEmployee.isPresent()){
				System.out.println(minEmployee.get().toString());
			}
		}
	}

	public static void main(String []z){
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("Amit", 33, new Address("2, PPP", "Pune", 88333)));
		employeeList.add(new Employee("Chirag", 23, new Address("2, PPP", "Pune", 88333)));
		employeeList.add(new Employee("Pankaj", 63, new Address("2, PPP", "Pune", 88333)));
		employeeList.add(new Employee("Rahul", 43, new Address("2, PPP", "Pune", 88333)));
		
		findYoungestEmployee(employeeList);
	}

}
