import java.util.*;

import javax.swing.tree.TreeNode;
public class TreeProblem1  {

    public  List<List<Integer>> level(TreeNode  root)
    {
        List<List<Integer>> result =new  ArrayList<>();
        
            if(root==null)
            {
               return result;
            }

           Queue<TreeNode> queue=new LinkedList<>();

           queue.offer(root);


           while (!queue.isEmpty()) {
                  
                int levelSize=queue.size();
                List<Integer> currentLevel =new  ArrayList<>();
        

                for (int i = 0; i < levelSize; i++) {
                    TreeNode currentNode=queue.poll();
                    currentLevel.add(currentNode.val) ;
                    if(currentNode.left !=null)
                    {
                        queue.offer(currentNode.left);
                    }
                    if(currentNode.right !=null)
                    {
                        queue.offer(currentNode.right);
                    }
                }
                result.add(currentLevel);
            
           }
          return result;
              
    }
    public static void main(String[] args) {
        

      
     
    }
    
}
