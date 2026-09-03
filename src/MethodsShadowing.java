public class MethodsShadowing {
    static int x=90;//this is know as class variable
    static void main(String[] args) {
        System.out.println(x);
        int x;//this is declaration
        x= 40;//this is initialization
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
//this is known as shadowing
//which means that the global value will be shadowed by the the local value in that method but only after the value has been changed before that the vallue
// will be the global value