class Solution {
    public int solution(int n) {
        n = (n%2==0) ? n : n-1;
        int sum = 0;
            
        for(int i=2; i<=n; i+=2) {
            sum+=i;
        }
        
        return sum;
    }
}