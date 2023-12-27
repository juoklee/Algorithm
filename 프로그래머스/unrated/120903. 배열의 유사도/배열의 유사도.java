import java.util.Arrays; 
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s2[j].equals(s1[i])) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}