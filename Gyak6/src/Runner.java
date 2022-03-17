
import java.util.Scanner;

public class Runner {

	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 3;
		Employee[] emps = new Employee[n];
		for(int i = 0; i < emps.length; i++){
			emps[i] = readEmployee();
		}
		System.out.println("Before changing retirement age:");
		printEmployees(emps);
		Employee.setRetirementAge(70);
		System.out.println("After changing retirement age:");
		printEmployees(emps);
		printThoseNCloseToRetirement(emps, 5);
		sc.close();

	}
	static void printThoseNCloseToRetirement(Employee [] emps, int n){
		for(Employee emp : emps){
			if(emp.yearsUntilRetirement() <= n){
				System.out.println(emp);
			}
		}
	}
	/*static void printThoseFarFromRetirement(Employee[] emps){
		double avgYearsTillRetirement
		
	}*/
	
	static double avgYearsTillRetirement(Employee [] emps){
		int sum = 0;
		for(Employee emp : emps){
			sum += emp.yearsUntilRetirement();
		}
		return (double)sum / emps.length;
	}
	
	
	static Employee readEmployee(){
		System.out.println("Please input name:");
		String name = sc.nextLine();
		System.out.println("Please input age:");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Please input salary:");
		int salary = Integer.parseInt(sc.nextLine());
		return new Employee(name, age, salary);
	}
	static void printEmployees(Employee[] emps){
		for(Employee emp : emps){
			System.out.println(emp);
		}
		
	}

}
