/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Pair{
    Node node;
    int level;
    Pair(Node n,int l){
        node =n;
        level = l;
    }
}

class Solution {
    public ArrayList<Integer> leftView(Node root) {
          
        List<Integer> list = new ArrayList<>();
        if(root==null) return new ArrayList<>(list);

        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();

        q.offer(new Pair(root,0));

        while(!q.isEmpty()){
            Pair p = q.poll();
            Node node = p.node;
            int l = p.level;

            if(!map.containsKey(l)){
                map.put(l,node.data);
            }

            if(node.left!=null) q.offer(new Pair(node.left,l+1));
            if(node.right!=null) q.offer(new Pair(node.right,l+1));
        }

        for(int ele:map.values()){
            list.add(ele);
        }

        return new ArrayList<>(list);
        
    }
}