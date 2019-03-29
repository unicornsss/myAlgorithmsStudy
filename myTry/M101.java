package myTry;

/**
 * Created by 羊 on 2019/3/29.
 */
public class M101 {
//    101、对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if(root == null )return true;
        return Test(root,root);
    }
    public boolean Test(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left != null && right!= null && left.val == right.val){
            boolean res1 =  Test(left.left,right.right);
            boolean res2 = Test(left.right,right.left);
            return  res1&&res2;
        }
        return false;
    }

    public static void main(String[] args) {
        M101 m = new M101();
    }
}
class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int x) { val = x; }
}