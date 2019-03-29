package myTry;

/**
 * Created by 羊 on 2019/3/29.
 */
public class M104 {
//    104. 二叉树的最大深度
//    思路：采用递归的方法，从底层往上计算，去左右中较大的一个来计算。
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return (left >= right) ? left+1 :right+1;
        }
    }
}
