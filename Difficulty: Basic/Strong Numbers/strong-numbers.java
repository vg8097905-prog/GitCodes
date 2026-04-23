// User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
        int num=N;
       
        int sum=0;
        while(N>0){
              
            int d=N%10;
            int fact=1;
            int i=1;
            
            while(i <= d){
                fact=fact*i;
                i++;
            }
            
           sum=sum+fact;
           N=N/10;
        } 
        
         if(sum == num){
             return 1;
         }else{
             return 0;
         }
        
    }
}