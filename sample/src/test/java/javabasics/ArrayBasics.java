package javabasics;

public class ArrayBasics {

    public static void main(String[] args) {
        int [] a = {5,6,7,9,10};
        String [] b ={"shri", "learnmore"};
        System.out.println(a[2]);
        System.out.println(b[1]);

        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for (int j=0; j<b.length; j++){
            System.out.println(b[j]);
        }
    }
}
