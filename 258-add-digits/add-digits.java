class Solution {
    public int addDigits(int num) {
        int t=num;
        while(t>9){
        t=AddAllDigs(t);
        }
        return t;
        }
     public int AddAllDigs(int nom){
        int sum=0;
        while(nom>0){
        int remainder=nom%10;
        sum+=remainder;
        nom/=10;
        }
        return sum;}}