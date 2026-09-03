package KUNALS;

public class ScopingFORLoops {
    static void main(String[] args) {
    int a =10;

        for (int i = 0 ; i < 4 ; i++){
            System.out.println(i);
            int num =100;
            a = 10;
        }

    }
}
//anything which is initialized can be used anywhere in method
//but anything initialized in the block or for loop or any loop cannot be used outside the box
//anything which was initialized in the public can be modified inside the block