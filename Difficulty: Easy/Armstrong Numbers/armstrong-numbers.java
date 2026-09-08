class Solution {
    static boolean armstrongNumber(int n) {
        // Counting the number of digit in integer 
        
        int k = String.valueOf(n).length();
        
        int temp = n;
        
        int sum =0;
        while(temp>0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit,k);
            temp = temp/10;
        }
        return sum==n;
        
    }
}