package myTry;

/**
 * Created by 羊 on 2019/3/28.
 */
public class M100 {
    // same tree
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q == null) return false;
        if( p == null&& q == null) return true;
        if(p.val == q.val){
            boolean res1 =  isSameTree(p.left,q.left);
            boolean res2 =  isSameTree(p.right,q.right);
            return res1&& res2;
        }else{
            return false;
        }
    }
    //更精简的语句写法
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val == q.val)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        return false;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}