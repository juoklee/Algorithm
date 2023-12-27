class Solution {
    public int solution(int[] array, int n) {
        int result = 0;
        
        for(int arr: array){
            result += (arr==n) ? 1 : 0;
        }
        
        return result;
    }
}