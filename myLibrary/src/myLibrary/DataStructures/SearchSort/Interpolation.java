package myLibrary.DataStructures.SearchSort;
import java.util.Arrays;
public class Interpolation {
	
	// Apply interpolation search
	public int interpolationSearchIterative(int[] array, int key)
	{
		Arrays.sort(array);
		int low =0, high = array.length-1;
		while(low<=high) {
			int pos=(key-array[low])/(array[high]-array[low]);
			int mid = low + ((high-low)*pos);
			if(key<array[mid]) {high=mid-1;}
			else if(array[mid]<key) {low=mid+1;}
			else {return mid;}
		}
		return -1; 
	}
	// Add any other parts needed
}
