/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    
    Node suc = null;
    public void find(Node root , int k){
        if(root==null) return;
        if(root.data>k){
            suc = root;
            find(root.left,k);
        }
        else{
            find(root.right,k);
        }
    }
    
    Node pre = null;
    
    public void find1(Node root  , int k){
        if(root==null) return;
        if(root.data<k){
            pre = root;
            find1(root.right,k);
        }
        else{
            find1(root.left,k);
        }
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
        find1(root,key);
        find(root,key);
        return new ArrayList<>(Arrays.asList(pre,suc));
        
    }
}