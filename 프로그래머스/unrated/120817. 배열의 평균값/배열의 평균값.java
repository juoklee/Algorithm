class Solution {
    public double solution(int[] numbers) {
        long sum = 0;
        
        for(int num:numbers) {
            sum += num;
        }
        
        return sum/(double)numbers.length;
    }
}