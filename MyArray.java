import java.util.Random;
import java.util.Arrays;

class MyArray {
	
	int[] my_array;
	int array_count;
	Random rand = new Random(100);
	
	public MyArray(int values) {
		my_array = new int[values*2];
		array_count = values;
		for(int i=0; i<array_count; i++) {
			my_array[i] = rand.nextInt(9) + 1;
		}
	}
	
	public void add(int newval) {
		my_array[array_count] = newval;
		array_count++;
	}
	
	public void find(int val) {
		int found = 0;
		for(int i=0; i<array_count; i++) {
			if(val == my_array[i]) {
				System.out.println("\nThe value " + my_array[i] + " was found at entry " + i + ".");
				found = 1;
				break;
			}
		}
		if (found == 0) {
			System.out.println("\nThe value wasn't found.");
		}
	}
	
	public void delete(int val) {
		for(int i=0; i<array_count; i++){
			if(val == my_array[i]) {
				for(int j=i; j<array_count-1; j++){
					my_array[j] = my_array[j+1];	
				}
				i--;
				my_array[array_count - 1] = 0;
				array_count--;
			}
		}
	}
	
	public void removeDuplicates() {
		int temp;
		System.out.println("\nConsolidating duplicates...");
		for(int i=0; i<array_count-1; i++) {
			temp = my_array[i];
			delete(my_array[i]);
			insert(temp, i);
		}
	}
	
	public void insert(int val, int entry) {
		array_count++;
		int temp = val;
		for (int i = array_count; i > entry; i--) {
			my_array[i] = my_array[i-1];
		}
		my_array[entry] = temp;
	}
	
	public void orderedInsert(int val) {
		add(val);
		order();
	}
	
	public void order() {
		System.out.println("\nOrdering...");
		int temp;
		for (int i=0; i<array_count-1; i++) {
			for (int j=0; j<array_count-1; j++) {
				if (my_array[i] < my_array[j]) {
					temp = my_array[i];
					my_array[i] = my_array[j];
					my_array[j] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {
	}
}