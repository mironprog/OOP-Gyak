package files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriterTask {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		 
		List<String> names = new ArrayList<String>();
		boolean finished = false;
		while(!finished){
			System.out.println("Please write a name!");
			String name = sc.nextLine();
			names.add(name);	
			System.out.println("Done? (y or n)");
			String done = sc.nextLine();
			if(done.equals("y")){
				finished = true;
			}
			}
		for(String name : names){
			System.out.println(name);
		}
		try {
			FileWriter fw = new FileWriter("file.txt");
			for(String name : names){
				fw.write(name + "\n");
			}
			fw.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
		
	}

}
