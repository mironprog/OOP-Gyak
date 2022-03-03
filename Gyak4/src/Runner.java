
public class Runner {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		emp2.setname("Johhny bravo");
		emp2.setSalary(50);
		emp.setname("Winnie the pooh");
		emp.setSalary(100);
		System.out.println(emp.toString());
		emp.raiseSalary(50);
		System.out.println(emp.toString());
		System.out.println(emp2.toString());
		emp2.raiseSalary(50);
		System.out.println(emp2.toString());
		
		System.out.println("Is withinin: " + emp.isWithinboundaries(10, 200));
		System.out.println("Is withinin: " + emp2.isWithinboundaries(10, 200));
		System.out.println("Tax: " + emp.getTax());
		System.out.println("Has greater: " + emp.higherSalarythan(emp2));
	}

}
