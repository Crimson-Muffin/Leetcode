// Given an array of size N. The task is to find the maximum and the
//minimum element of the array using the minimum number of comparisons.
// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//               Maximum element is: 9
import java.util.Arrays;

class Pair {
	public int min;
	public int max;
}

class Main {
	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		Arrays.sort(arr);
		minmax.min = arr[0];
		minmax.max = arr[n - 1];
		return minmax;
	}

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int arr_size = arr.length;
		Pair minmax = getMinMax(arr, arr_size);
		System.out.println("Minimum element is " + minmax.min);
		System.out.println("Maximum element is " + minmax.max);   
	}
}
