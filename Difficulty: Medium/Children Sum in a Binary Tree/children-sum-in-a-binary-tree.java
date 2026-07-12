/* Node Structure
class Node{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
} */
class Solution {
    public boolean isSumProperty(Node root) {
        if(root==null) return true;
        int child = 0;
        if(root.left==null && root.right==null) return true;
        if(root.left !=null) child += root.left.data;
        if(root.right !=null) child += root.right.data;
        if(child !=root.data) return false;
        return (isSumProperty(root.left) && isSumProperty(root.right));
    }
}