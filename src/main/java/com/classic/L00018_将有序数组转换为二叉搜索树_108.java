package com.classic;

import java.util.Random;

public class L00018_将有序数组转换为二叉搜索树_108 {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    // 中序遍历，总是选择中间位置左边的数字作为根节点
    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    // 中序遍历，总是选择中间位置右边的数字作为根节点
    public TreeNode helper1(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 总是选择中间位置右边的数字作为根节点
        int mid = (left + right + 1) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

    // 中序遍历，选择任意一个中间位置数字作为根节点
    public TreeNode helper3(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 选择任意一个中间位置数字作为根节点
        Random rand = new Random();
        int mid = (left + right + rand.nextInt(2)) / 2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }

}
