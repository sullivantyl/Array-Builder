import java.util.Scanner;
import java.util.Arrays;

class MyArrayMain {
	
	public static void main(String args[]) {
		int running = 1;
		Scanner scn = new Scanner(System.in);
		String conf = "";
		
		System.out.println("\nHow many values will you start with?");
		int values = scn.nextInt();
		
		MyArray my_array = new MyArray(values);
		
		while (running == 1) {
			System.out.println("\nEnter the operation you'd like to complete:");
			System.out.println("(print / add / find / delete / insert / duplicates / orderedinsert / quit)");
			
			conf = scn.next();
			
			if (conf.equals("print")) {
				System.out.println(Arrays.toString(my_array.my_array));
				System.out.println(my_array.array_count);
			}
			
			else if (conf.equals("add")) {
				System.out.println("\nAdd what value?");
				int val = scn.nextInt();
				my_array.add(val);
			}
			
			else if (conf.equals("find")) {
				System.out.println("\nFind what value?");
				int val = scn.nextInt();
				my_array.find(val);
			}
			
			else if (conf.equals("delete")) {
				System.out.println("\nDelete what value?");
				int val = scn.nextInt();
				my_array.delete(val);
			}
			
			else if (conf.equals("duplicates")) {
				my_array.removeDuplicates();
			}
			
			else if (conf.equals("insert")) {
				System.out.println("\nInsert what value?");
				int val = scn.nextInt();
				System.out.println("\nAt what point?");
				int entry = scn.nextInt();
				my_array.insert(val, entry);
			}
			
			else if (conf.equals("orderedinsert")) {
				System.out.println("\nInsert what value?");
				int val = scn.nextInt();
				my_array.orderedInsert(val);
			}
			
			else if (conf.equals("quit")) {
				System.out.println("\nQuitting...");
				running = 0;
			}
			
			else {
				System.out.println("\nInvalid input...");
			}
		}
	}
}