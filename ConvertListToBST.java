/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertListToBST {
    
    public TreeNode recfun(ArrayList<Integer> array,int low,int high){
        if(low == high){
            TreeNode root = new TreeNode(array.get(low));
            return root;
        }
        else if(low > high){
            return null;
        }
        else{
            int mid = low + (high - low)/2;
            TreeNode root = new TreeNode(array.get(mid));
            root.left = recfun(array,low,mid - 1);
            root.right = recfun(array,mid+1,high);
        
            return root;
        }
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null)
            return null;
        if(head.next == null)
            return new TreeNode(head.val);
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode current = head;
        while(current != null){
            al.add(current.val);
            current = current.next;
        }
        
        return recfun(al,0,al.size() - 1);
        
    }
}


/*

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 /*
public class Solution {
    
    //public int getMidIndex(int[] array){
        
    //}
    
    public TreeNode recfun(int[] array,int low,int high){
        if(low == high){
            TreeNode root = new TreeNode(array[low]);
            return root;
        }
        else if(low > high){
            return null;
        }
        else{
            int mid = low + (high - low)/2;
            TreeNode root = new TreeNode(array[mid]);
            root.left = recfun(array,low,mid - 1);
            root.right = recfun(array,mid+1,high);
        
            return root;
        }
    }
    
    
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;
        //if(nums.length == 1)
          //  return new TreeNode(nums[0]);
        
        return recfun(nums,0,nums.length - 1);  
        
        
    }
}



*/


