/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    int ans = -1;
    public void find(Node root , Node k){
        if(root==null) return;
        if(root.data>k.data){
            ans = root.data;
            find(root.left,k);
        }
        else{
            find(root.right,k);
        }
    }
    public int inOrderSuccessor(Node root, Node k) {
        find(root,k);
        return ans;
    }
}