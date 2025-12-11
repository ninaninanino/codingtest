package me.linna;
public class Main {
    public static void main(String[] args) {
        /*
        class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        return answer;
            }
        }
        */
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String answer = "";
        StringBuilder sb = new StringBuilder(index_list.length);

        for (int i : index_list) {
            sb.append(my_string.charAt(i));
        }
        answer = sb.toString();
        System.out.println(answer);
        //return answer;
    }
}