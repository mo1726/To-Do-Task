package Company;

import java.util.ArrayList;
import java.util.Scanner;

public class To_Do {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		ArrayList<String> tasks = new ArrayList<>();
		ArrayList<String> isCompletes = new ArrayList<>();
		int num ;
		
		
		
		while(true) {
			System.out.println("\n\n");
			System.out.println("choise Number ");
			System.out.println("1-Add new task ");
			System.out.println("2-Remove task ");
			System.out.println("3-Show all task ");
			System.out.println("4-Task is complete ");
			System.out.println("5-Show all task is complete ");
			System.out.println("6-Exit ");
			num = input.nextInt();
			input.nextLine(); 
			
			
			
			switch(num) {
			case 1 :
				System.out.println("Add new task ");
				String task = input.nextLine();
				tasks.add(task);
				break;
			case 2 :
				System.out.println("Enter task you need remove ");
				String removeTask = input.nextLine();
				if (tasks.contains(removeTask)) {
					tasks.remove(removeTask);
				}
				else {
					System.out.println(" The task not founded");
				}
				break;
			case 3 :
				for(int i =0 ; i<tasks.size();i++) {
					System.out.println( i+1 +" - "+tasks.get(i));
                    
				}
				break;
			case 4 :
				System.out.println("Enter task Complete ");
				String isComplete = input.nextLine();
				isCompletes.add(isComplete);
				if (tasks.contains(isComplete)) {
					tasks.remove(isComplete);
				}
				break;
			case 5 :
				for(int i =0 ; i<isCompletes.size();i++) {
					System.out.println(isCompletes.get(i));
					
				}
				break;
			case 6 :
				System.out.println("System Exiting");
				break;
			}
		}
		
		

	}

}
