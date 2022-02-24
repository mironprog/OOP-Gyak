
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Adjon meg egy szamot 1 - 9 kozott");
			while(!input.hasNextInt()){
				System.out.println("Input error");
				input.next();
			}
			n = input.nextInt();
		
		}while(n < 0 || n > 10);
		
		
		for(int i = 0; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
