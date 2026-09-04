package etc;

public class Pg1 {
    static void main(String[] args) {
        class Solution {
            public int solution(int slice, int n) {
                int answer = 0;
                if (slice >= n){
                    answer = 1;
                    return answer;
                }
                else{
                    if (n % slice == 0){
                        answer = n / slice;
                        return answer;
                    }
                    else{
                        answer = n / slice +1;
                        return answer;
                    }
                }
            }
        }
    }
}
