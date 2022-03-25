package com.classic;

import java.util.*;

public class L00017_层次遍历_NC15 {

     static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
     }

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int curLen = queue.size();
            for(int i = 0; i < curLen; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;
    }
}
