public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left=null;
		right=null;
	}

	TreeNode(int x, TreeNode left, TreeNode right) {
		val = x;
		left=left;
		right=right;
	}
}
