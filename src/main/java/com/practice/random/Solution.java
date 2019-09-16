package com.practice.random;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    PriorityQueue<vOrderNode> queue = new PriorityQueue<>(new comp());
    private void helper(TreeNode root, int level){
        if(root == null)
            return;
        
        vOrderNode node = new vOrderNode(root.val,level);
        queue.add(node);
        helper(root.left,level-1);
        helper(root.right,level+1);
        
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> resp = new ArrayList<>();
        helper(root,1);
         Iterator itr = queue.iterator(); 
        int prev = 2000;
        List<Integer> ls = null;
        while (queue.size()!=0) { 
            vOrderNode vnode = queue.poll();
            
           if(vnode.level != prev){
               prev = vnode.level;
               if(ls != null)
                  resp.add(ls);
              ls = new ArrayList<>();   
           }else{
            ls.add(vnode.value);
           }
               
        } 
        
        return resp;
        
        
    }
    
    
}
class comp implements Comparator<vOrderNode>{
    
    public int compare(vOrderNode n1, vOrderNode n2){
        return n1.level - n2.level;
    }
}
class vOrderNode{
        int value;
        int level;
        
        vOrderNode(int value, int level){
            this.value = value;
            this.level = level;
        }
    }
