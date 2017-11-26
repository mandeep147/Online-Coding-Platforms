/**
 * Problem 111: Minimum Depth of Binary Tree
 * 
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * 
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 */
package mandeep.leetcode.trees;

/**
 * @author mandeep
 *
 */
public class MinimumDepthBinaryTree {
	
	public static void main(String[] args){
		TreeNode root = CreateTree.createTree();
		System.out.println(minDepth(root));
	}
	
	public static int minDepth(TreeNode root){
		if(root == null)
			return 0;
		
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left == 0 || right == 0)? left + right + 1: Math.min(left, right)+1;
	}
}