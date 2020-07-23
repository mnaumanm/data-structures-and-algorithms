public class GenericTreeNode<T> {

	T val;
	GenericTreeNode left;
	GenericTreeNode right;

	GenericTreeNode(T x) {
		val = x;
		left=null;
		right=null;
	}

	GenericTreeNode(T x, TreeNode left, TreeNode right) {
		val = x;
		left=left;
		right=right;
	}
}
