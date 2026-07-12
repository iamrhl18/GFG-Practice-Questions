/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int maxcount = 0;
    public Node findNode(Node root ,int  target){
        if(root==null) return null;
        if(root.data == target) return root;
        Node l = findNode(root.left,target);
        if(l != null) return l;
        return findNode(root.right,target);
    }
    
    public void rec(Node tar , int count , Set<Node> vis , Map<Node , Node > map ){
        vis.add(tar);
        if(tar==null) return;
        maxcount = Math.max(count,maxcount);
        
        if(map.get(tar) != null && !vis.contains(map.get(tar))){
            rec(map.get(tar) , count +1,vis , map);
        }
        
        if(tar.left != null && !vis.contains(tar.left)){
            rec(tar.left , count +1 , vis , map);
        }
        if(tar.right != null && !vis.contains(tar.right)){
            rec(tar.right , count +1 , vis , map);
        }
        
    }
    public int minTime(Node root, int target) {
        if(root==null) return 0;
       Map<Node , Node > map = new HashMap<>();
       Queue<Node> q = new LinkedList<>();
       q.offer(root);
       map.put(root,null);
       while(!q.isEmpty()){
           Node node = q.poll();
           if(node.left!=null){
               map.put(node.left,node);
               q.offer(node.left);
           }
           if(node.right!=null){
               map.put(node.right,node);
               q.offer(node.right);
           }
       }
       
       Node tar = findNode(root,target);
       int count = 0;
       Set<Node> vis = new HashSet<>();
       
       
       rec(tar,count,vis,map);
       return maxcount;
       
       
        
    }
}





















