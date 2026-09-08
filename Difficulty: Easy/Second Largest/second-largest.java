class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int lar = -1;
        int seclar = -1;
        for(int ele:arr){
            if(ele>lar){
                seclar = lar;
                lar = ele;
            }
            if(ele>seclar && ele!=lar) seclar = ele;
        }
        return seclar;
        
    }
}