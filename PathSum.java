........................................................................................recursive...........................................................................................................
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.left==null && root.right==null && sum-root.val==0)
            return true;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
        
        
        
        
        
    }
}
......................................................................................................................................iterative........................................................................
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        Stack<TreeNode> val=new Stack<>();
        Stack<Integer> diff=new Stack<>();
        val.push(root);
        diff.push(sum-root.val);
        while(!val.isEmpty())
        {
            TreeNode curr=val.pop();
            int d=diff.pop();
            if(curr.left==null && curr.right==null && d==0)
            {
                return true;
            }
            if(curr.left!=null)
            {
                val.push(curr.left);
                diff.push(d-curr.left.val);
                
            }
            if(curr.right!=null)
            {
                val.push(curr.right);
                diff.push(d-curr.right.val);
                
            }
        }
        
        
        
        
        
        
        return false;
        
        
        
        
        
        
        
    }
}
        