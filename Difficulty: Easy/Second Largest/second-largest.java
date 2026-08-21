class Solution {
    public int getSecondLargest(int[] arr) {
        
        int l1 = -1;
        int l2 = -1;
        
        // for the largest element 
        for(int ele : arr){
            if(ele>l1){
                l1 = ele;
            }
        }
        for(int ele:arr){
            if(ele>l2 && ele!=l1){
                l2 = ele;
            }
        }
        return l2;
    }
}