class Solution {
    public static boolean ispalendrome(int num){
        int temp = num;
        int rev = 0;
        while(temp>0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }
        return num==rev;
    }
    public static boolean isPalinArray(int[] arr) {
        for(int ele:arr){
            if(ispalendrome(ele)==false) return false;
        }
        return true;
    }
}