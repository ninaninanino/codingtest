package me.linna;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        //case1. 숫자 넷이 모두 같음
        if (a==b && b==c && c==d) {
            System.out.println(1111*a);
        }
        //case2. 숫자 넷이 모두 다름
        else if (a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
            System.out.println(Math.min(Math.min(a,b), Math.min(c,d) ));
        }
        //case5. 숫자 세개가 같음
        else if (a==b && b==c && c!=d) {// abc d
            System.out.println((int)Math.pow(10*a+d,2));
        }else if (a!=b && b==c && c==d) {// a bcd
            System.out.println((int)Math.pow(10*b+a,2));
        }else if (a==c && b!=c && c==d) { // b acd
            System.out.println((int)Math.pow(10*a+b,2));
        }else if (a==b && b!=c && b==d) { // c abd
            System.out.println((int)Math.pow(10*a+c,2));
        }
        //case4. 숫자 둘씩 같음
        else if ((a==b && c==d && a!=c)||(a!=c && a==d && c==b)) {
            System.out.println((a+c)*Math.abs(a-c));
        } else if ((a==c && b==d && a!=b) || (a==d && b==c && a!=b) ) {
            System.out.println((a+b)*Math.abs(a-b));
        }
        //case3. 숫자 둘만 같음
        else if (a==b && a!=c && a!=d && b!=c && b!=d && c!=d) { //ab
            System.out.println(c*d);
        } else if (a!=b && a==c && a!=d && b!=c && b!=d && c!=d) {//ac
            System.out.println(b*d);
        } else if (a!=b && a!=c && a==d && b!=c && b!=d && c!=d){ //ad
            System.out.println(b*c);
        } else if (a!=b && a!=c && a!=d && b==c && b!=d && c!=d) {//bc
            System.out.println(a*d);
        } else if (a!=b && a!=c && a!=d && b!=c && b==d && c!=d) {//bd
            System.out.println(a * c);
        } else if (a!=b && a!=c && a!=d && b!=c && b!=d && c==d) {//cd
            System.out.println(a * b);
        }
    }
}