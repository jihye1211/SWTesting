package largerNumber;

public class LargestNumber {
	public static int getLargest(int[] list) {
		int index, max = 0; // Integer.MAX_VALUE;
		for(index=0; index<list.length; index++) { //-1; index++
			if(list[index] > max) {
				max = list[index];
			}
		}
		return max;
	}
}
