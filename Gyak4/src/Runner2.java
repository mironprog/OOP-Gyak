import java.util.Scanner;

public class Runner2 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		
		for(int i = 0; i < emps.length; i++){
			emps[i] = new Employee();
			readEmployee(emps[i]);
		}
		printArray(emps);
		int maxI = indexofhishestSalaryIndex(emps);
		System.out.println("Highest salary: " + emps[maxI].toString());
		System.out.println();
		System.out.println();
		System.out.println();
		sc.close();

	}
	
	static int indexofhighestSalaryIndex(Employee[] emps){
		int maxI = 0;
		for(int i = 0; i < emps.length; i++){
			if(emps[i].higherSalarythan(emps(maxI))){
				
			}
		}
		return maxI;
	}
	
	static int countEmpsWithsalaryInterval(Employee[] emps, int lower, int upper){
		int count = 0;
		for(Employee emp: emps){
			if(emp.isWithinboundaries(lower, upper)){
				count++;
			}
		}
	}
	static int calcAvgSalary(Employee [] emps){
		int sum = 0;
		for(Employee emp: emps){
			sum += emp.getSalary();
			
		}
	}
	static int calcTaxSum
	
	static void readEmployee(Employee emp){
		String name = sc.nextLine();
		int salary = Integer.parseInt(sc.nextLine());
		emp.setname(name);
		emp.setSalary(salary);
	}
	static void printArray(Employee[] emps){
		for(Employee emp: emps){
			System.out.println(emp.toString());
		}
	}

}
