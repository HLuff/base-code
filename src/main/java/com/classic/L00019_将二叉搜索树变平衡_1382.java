package com.classic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class L00019_将二叉搜索树变平衡_1382 {

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

    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorderSeq = new ArrayList<Integer>();
        getInorder(root, inorderSeq);
        return build(0, inorderSeq.size() - 1, inorderSeq);
    }

    public void getInorder(TreeNode o, List<Integer> inorderSeq) {
        if (o.left != null) {
            getInorder(o.left, inorderSeq);
        }
        inorderSeq.add(o.val);
        if (o.right != null) {
            getInorder(o.right, inorderSeq);
        }
    }

    public TreeNode build(int l, int r, List<Integer> inorderSeq) {
        int mid = (l + r) >> 1;
        TreeNode o = new TreeNode(inorderSeq.get(mid));
        if (l <= mid - 1) {
            o.left = build(l, mid - 1, inorderSeq);
        }
        if (mid + 1 <= r) {
            o.right = build(mid + 1, r, inorderSeq);
        }
        return o;
    }

}
