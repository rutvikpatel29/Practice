package BST_Convert_BST_To_MinHeap_In_Place;

// Time Complexity: O(n)
// Space Complexity: O(n)
public class MainClass {
	public static void main(String[] args) {
		Node root = new Node(4);
		BinarySearchTree tree = new BinarySearchTree();
		
		Node node2 = new Node(2);
		Node node3 = new Node(6);
		Node node4 = new Node(1);
		Node node5 = new Node(3);
		Node node6 = new Node(5);
		Node node7 = new Node(7);

		root.left = node2;
		root.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		tree.convertToMinHeap(root);
		
		tree.printInOrderTraversal(root);
	}
}
