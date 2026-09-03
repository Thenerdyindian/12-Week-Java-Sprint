package KUNALS;

public class methodScoping {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            /*int*/
            a = 78;//cannot be intialized two times but can modify it
            int c = 99; // values initialized in this block will only remain in block and connot be used outside
            //but already initialized out side the block but in the same method you can change the value but not initialize it again
        }
        //System.out.println(c); - this gives error
        System.out.println(a);
//        System.out.println(change());
    }

//    static int change() {
//        int a = 345;
//        return a;
//    }
}







//any changes made to the value are only valid to that method only , that is the scope of a function
// if int was 10 out side and u changes it to 20 in a method then the outside value will not bbe changed

