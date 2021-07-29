public class BinarySearch {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5};
		
		System.out.println(binarySearch(data, 0, data.length - 1, 3));

	}
	
	public static boolean binarySearch(int[] data, int low, int high, int target) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (target == data[mid]) {
				return true;
			}
			else if (target < data[mid]) {
				high = mid - 1;
			}
			
			else {
				low = mid + 1;
			}
			binarySearch(data, low, high, target);
		}
		return false;
	}

}
