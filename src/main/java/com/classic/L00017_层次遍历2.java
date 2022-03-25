package com.classic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L00017_层次遍历2 {

     static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
     }

     public List<Integer> BFS(TreeNode root){
         Queue<TreeNode> queue = new LinkedList<>();
         List<Integer> res = new ArrayList<>();
         if(root == null){
             return null;
         }
         queue.add(root);
         while(!queue.isEmpty()){
             // 挨个处理
             TreeNode node = queue.poll();
             if(node == null){
                 continue;
             }
             if(node.left != null){
                 queue.add(node.left);
             }
             if(node.right != null){
                 queue.add(node.right);
             }
             res.add(node.val);
         }
         return res;
     }
}
