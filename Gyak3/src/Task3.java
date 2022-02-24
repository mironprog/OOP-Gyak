
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		char op;
		double Number1, Number2, Result;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Adja meg a muveletet:");
		op = input.next().charAt(0);
		
		System.out.println("Adja meg az elso szamot:");
		Number1 = input.nextDouble();
		
		System.out.println("Adja meg a masodik szamot:");
		Number2 = input.nextDouble();
		
		switch (op){
		case '+':
			Result = Number1 + Number2;
			System.out.println(Result);
			break;
			
		case '-':
			Result = Number1 - Number2;
			System.out.println(Result);
			break;
		
		case '*':
			Result = Number1 * Number2;
			System.out.println(Result);
			break;
		
		case '/':
			Result = Number1 / Number2;
			System.out.println(Result);
			break;
		}
		
		
		
		
		
		
		input.close();
		

	}

}
