.....................................o(n) using recursion........................................................................................................................
class Solution {
    TreeNode first=null;
    TreeNode second=null;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
    }
    
    private void traverse(TreeNode root)
    {
        if(root==null)
            return;
        traverse(root.left);
        
        if(first==null && prev.val>root.val)
            first=prev;
        if(first!=null && prev.val>root.val)
            second=root;
        
        prev=root;
        
        traverse(root.right);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}*/
..........................................................0(1)space using morris algo.........................................................................................................................
class Solution {
    
    public void recoverTree(TreeNode root) {
        if(root==null)
            return;
        TreeNode first=null;
    TreeNode second=null;
    TreeNode prev=null;
       
        while(root!=null)
        {
            if(root.left==null)
            {
                
                 //print root
                //....................................................
                  if(prev!=null &&  prev.val>root.val)
                  {
                      if(first==null )
                          first=prev;
                      
                      second=root;
                  }
                prev=root;
                //........................................................
                root=root.right;
            }
            else
            {
               //find inorder predecessor
                TreeNode pred=root.left;
                while(pred.right!=root && pred.right!=null)
                    pred=pred.right;
                
                if(pred.right==null)
                {
                    pred.right=root;
                    
                    root=root.left;
                }
                else
                {
                    pred.right=null;
                    //print root
                    //................................................
                     if(prev!=null &&  prev.val>root.val)
                  {
                      if(first==null )
                          first=prev;
                      
                      second=root;
                  }
                prev=root;
                    //................................................
                     
                    root=root.right;
                }
            }
        }  
            
    int temp=first.val;
        first.val=second.val;
        second.val=temp;
        
    }
    
}






