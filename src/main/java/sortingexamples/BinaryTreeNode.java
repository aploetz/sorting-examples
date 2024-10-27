package sortingexamples;

public class BinaryTreeNode {

	private int value;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode() {
		
	}

	public BinaryTreeNode(int number) {
		this.value = number;
	}

	public void insert(int newNumber) {
		
		if (newNumber < this.value) {
			if (this.left != null) {
				this.left.insert(newNumber);
			} else {
				this.left = new BinaryTreeNode(newNumber);
			}
		} else {
			// if (newNumber > this.value)
			if (this.right != null) {
				this.right.insert(newNumber);
			} else {
				this.right = new BinaryTreeNode(newNumber);
			}
		}
	}
	
	// getters/setters
	public int getValue() {
		return value;
	}
	
	public BinaryTreeNode getLeft() {
		return left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}
}
