package me.linna;

import java.util.Arrays;

public class P18916 {
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0;

            /**
             * gpt로 얻은 답: a,b,c,d 를 정렬하여 풀이함
             * 이때 모두 같다면 x[0] == x[3]일 것임.
             */
            int[] x = {a,b,c,d};
            Arrays.sort(x);

            //case. 숫자 넷이 모두 같음
            if (x[0] == x[3]) {
                answer = 1111*x[0];
            }
            //case. 숫자 세개가 같음
            else if (x[1] == x[3]) {
                int p = x[3]*10;
                int q = x[0];
                answer = (int) Math.pow(p+q,2);
            } else if (x[0]==x[2]) {
                int p = x[0]*10;
                int q = x[3];
                answer = (int) Math.pow(p+q,2);
            }
            //case. 숫자 둘씩 같음
            else if (x[0]==x[1] && x[2]==x[3]) {
                int p = x[0];
                int q = x[2];
                answer = (p+q) * Math.abs(p-q);
            }
            //case. 숫자 둘만 같음
            else if (x[0]==x[1]) {
                int q = x[2];
                int r = x[3];
                answer = q*r;
            } else if (x[1]==x[2]) {
                int q = x[0];
                int r = x[3];
                answer = q*r;
            } else if (x[2]==x[3]) {
                int q = x[0];
                int r = x[1];
                answer = q*r;
            }
            //case. 숫자 넷이 모두 다름
            else {
                answer = x[0];
            }
            return answer;
        }
    }
}
