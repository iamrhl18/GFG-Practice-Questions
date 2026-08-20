class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
       int  min = arr[0];
        int max=arr[0];
        for(int ele:arr){
            min = Math.min(min,ele);
            max = Math.max(max,ele);
        }
        return new ArrayList<>(Arrays.asList(min,max));
    }
}
