package sortingexamples;

public class SortingMain {

	public static void main(String[] args) {
		
		// define arrays
		int[] numbers = {7,34,22,78,3452,3,99,16,68,4};
		int[] numbers2 = {7,34,22,78,3452,3,99,16,68,4};
		
		// print array
		System.out.println(printIntArray(numbers));

		// print array after bubble sort
		System.out.println(printIntArray(bubbleSort(numbers)));
		
		// print array after binary (tree) sort
		binarySort(numbers2);

	}

	private static void binarySort(int[] intArray) {
		
		BinaryTreeNode root = null;
		
		for (int num : intArray) {
			
			if (root != null) {
				root.insert(num);
			} else {
				// root is null...first number in list
				root = new BinaryTreeNode(num);
			}
		}
	
		// traverse
		binaryTraverse(root);
	}
	
	private static void binaryTraverse(BinaryTreeNode node) {
		
		if (node != null) {
			binaryTraverse(node.getLeft());
			System.out.println(node.getValue());
			binaryTraverse(node.getRight());
		}		
	}
	
	private static int[] bubbleSort(int[] intArray) {
		
		// need to track whether or not we have "flipped" a pair of ints during the current pass.
		boolean flippedAPair = false;
		
		//for (int idx = 0; idx < returnVal.length; idx++) {
		int idx = 0;
		while (flippedAPair || idx < intArray.length - 1) {
			// check current array value against the next value
			// if it's greater, then flip them
			if (intArray[idx] > intArray[idx+1]) {
				int temp = intArray[idx];
				intArray[idx] = intArray[idx+1];
				intArray[idx+1] = temp;
				flippedAPair = true;
			}
		
			idx++;
			
			// if we get to the end-1 of the array, and we haven't had to "flip" a pair, then it is sorted!
			// otherwise, reset
			if (idx >= (intArray.length - 1) && flippedAPair) {
				// reset conditions
				idx = 0;
				flippedAPair = false;
			}
		}
		
		return intArray;
	}
	
	private static String printIntArray(int[] intArray) {
		
		StringBuilder returnVal = new StringBuilder();
		
		for (int num : intArray) {
			returnVal.append(num);
			returnVal.append(",");
		}
		
		return returnVal.toString();
	}
}
