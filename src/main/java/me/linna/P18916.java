package me.linna;

public class P18916 {
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int answer = 0;

            //case1. 숫자 넷이 모두 같음
            if (a==b && b==c && c==d) {
                answer = 1111*a;
            }
            //case5. 숫자 넷이 모두 다름
            else if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
                answer = Math.min(Math.min(a,b), Math.min(c,d) );
            }
            //case2. 숫자 세개가 같음
            else if (a==b && b==c && c!=d) {// abc d
                answer =(int)Math.pow(10*a+d,2);
            }else if (a!=b && b==c && c==d) {// a bcd
                answer = (int)Math.pow(10*b+a,2);
            }else if (a==c && b!=c && c==d) { // b acd
                answer = (int)Math.pow(10*a+b,2);
            }else if (a==b && b!=c && b==d) { // c abd
                answer = (int)Math.pow(10*a+c,2);
            }
            //case3. 숫자 둘씩 같음
            else if ((a==b && c==d && a!=c)||(a!=c && a==d && c==b)) {
                answer = (a+c)*Math.abs(a-c);
            } else if ((a==c && b==d && a!=b) || (a==d && b==c && a!=b) ) {
                answer = (a+b)*Math.abs(a-b);
            }
            //case4. 숫자 둘만 같음
            else if (a==b && a!=c && a!=d && b!=c && b!=d && c!=d) { //ab
                answer = (c*d);
            } else if (a!=b && a==c && a!=d && b!=c && b!=d && c!=d) {//ac
                answer = (b*d);
            } else if (a!=b && a!=c && a==d && b!=c && b!=d && c!=d){ //ad
                answer = (b*c);
            } else if (a!=b && a!=c && a!=d && b==c && b!=d && c!=d) {//bc
                answer = (a*d);
            } else if (a!=b && a!=c && a!=d && b!=c && b==d && c!=d) {//bd
                answer = (a * c);
            } else if (a!=b && a!=c && a!=d && b!=c && b!=d && c==d) {//cd
                answer = (a * b);
            }


            return answer;
        }
    }
}
