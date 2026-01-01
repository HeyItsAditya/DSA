class Solution {
    public int[] plusOne(int[] digits) {
        //sync setup succesful 
        int i=digits.length-1;
        while(digits[i]==9){
           if(i==0){
            int newSize = digits.length + 1;
            int[] newArray = new int[newSize];
            newArray[0]=1;
            return newArray;
           }
           digits[i]=0;
           i--;
        }
        digits[i]=digits[i]+1;
        return digits;
    }
}