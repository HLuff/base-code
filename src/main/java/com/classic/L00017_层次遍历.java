package com.classic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L00017_层次遍历 {

     static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
     }

     public List<TreeNode> BFS(TreeNode root){
         Queue<TreeNode> queue = new LinkedList<>();
         List<TreeNode> res = new ArrayList<>();
         if(root == null){
             return null;
         }
         queue.add(root);
         while(!queue.isEmpty()){
             // 判断一次把当前队列所有的node处理一次
             int curLen = queue.size();
             for(int i = 0; i < curLen; i++){
                 TreeNode node = queue.peek();
                 if(node == null){
                     continue;
                 }
                 if(node.left != null){
                    queue.add(node.left);
                 }
                 if(node.right != null){
                     queue.add(node.right);
                 }
                 res.add(queue.poll());
             }
         }
         return res;
     }

}
