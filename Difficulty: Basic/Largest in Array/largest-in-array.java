class Solution {
    public static int largest(int[] arr) {
        int large = arr[0];
        for(int ele:arr){
            if(ele>large) large = ele;
        }
        return large;
        
    }
}
