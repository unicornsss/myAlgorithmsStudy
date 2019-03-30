package myTry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by 羊 on 2019/3/30.
 */
public class M107 {
//    107. 二叉树的层次遍历 II
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if (root == null) return res;
        que.add(root);
        while(que.size()>0){
            List<Integer> list = new ArrayList<Integer>();
            int size = que.size();
            for (int i = 0; i < size; i++) {
                TreeNode node  = que.poll();
                list.add(node.val);
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }
            res.add(0,list);
        }
        return res;
    }



}
