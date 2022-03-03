
public class Employee {
	
	private String name;
	private int salary;
	int age;
	
	
	void raiseSalary(int raise){
		salary += raise;
	}
	
	public boolean isWithinboundaries(int lower, int upper){
		return lower <= salary && upper >= salary;
	}
	public int getTax(){
		return (int)(salary * 016);
	}
	
	public boolean higherSalarythan(Employee emp){
		return salary > emp.getSalary();
	}
	
	@Override
	public String toString(){
		return name + ": " + salary;
	}
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
		
	}
	public void setname(String name){
		this.name = name;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	
}
