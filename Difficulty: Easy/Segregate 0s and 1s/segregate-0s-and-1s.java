class Solution {
    void segregate0and1(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[j]==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
                i++;
            }else{
                j--;
            }
        }
    }
}
