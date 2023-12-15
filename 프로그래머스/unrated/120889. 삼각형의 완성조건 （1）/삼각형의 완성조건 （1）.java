import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int max = sides[sides.length-1];
        int sum = 0;
        
        for(int i=0; i<sides.length-1; i++) {
            sum += sides[i];
        }
        
        return sum = sum > max ? 1 : 2;
    }
}