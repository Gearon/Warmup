package alive.gearon.sword;

/**
 * 
输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 *
 */
public class NO4 {
    
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	if(pre.length == 0){
    		return null;
    	}
    	TreeNode root = new TreeNode(pre[0]);
    	int leftLength = 0;
    	for(int i = 0; i < in.length; i++){
    		if(root.val == in[i]){
    			leftLength = i;
    		}
    	}
    	int leftPre[] = new int[leftLength];
    	int leftIn[] = new int[leftLength];

    	int rightLength = in.length - leftLength - 1;
    	int rightPre[] = new int[rightLength];
    	int rightIn[] = new int[rightLength];

    	for(int i = 0; i < in.length; i++){
    		if(i < leftLength){
    			leftIn[i] = in[i];
    		}else if(i > leftLength){
    			rightIn[i - leftLength - 1] = pre[i];
    		}
    	}

    	for(int i = 0; i < pre.length; i++){
    		if(i == 0)
    			continue;
    		else if(i <= leftLength){
    			leftPre[i - 1] = pre[i];
    		}else{
    			rightPre[i - leftLength -1] = in[i];
    		}
    	}
    	root.left = reConstructBinaryTree(leftPre, leftIn);
    	root.right = reConstructBinaryTree(rightPre, rightIn);
    	return root;
    }
    
    /**
     * Definition for binary tree
     */
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
