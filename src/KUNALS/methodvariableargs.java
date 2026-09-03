package KUNALS;

import java.util.Arrays;

public class methodvariableargs {
    static void main(String[] args) {
        fun(12,342,3,3,2,34);
        multiple(2,4,"kunal ", "talha");
    }

    static void multiple(int a , int b ,String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

