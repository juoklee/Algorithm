class Solution {
    public int solution(int[] array, int height) {
        int count = 0;
        for(int array_height : array) {
            if (array_height> height) count++;
        }
        return count;
    }
}