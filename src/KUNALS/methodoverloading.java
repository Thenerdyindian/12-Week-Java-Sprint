package KUNALS;

public class methodoverloading {
    static void main(String[] args) {
        fun(67);
        fun("Talha");
        fun(12,3);
        //fun(); // just this one will give error as there will be ambiguity
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(int a , int b){
        System.out.println(a+b);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
//this is method overloading or function overloading