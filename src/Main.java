
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(5);
        numList.add(4);
        numList.add(25);
        numList.add(2);
        numList.add(14);
        numList.add(87);
        numList.add(56);
        System.out.println(numList);
        Collections.sort(numList);
        System.out.println(numList);

        //write the binary search to look for 25
        //find the middle
        //is target less than or greater than middle
        //if less, get rid of middle and elements to right
        //else get rid of middle and elements to left
        //repeat until you are left with one element
        //if that element is target, return it, else return -1
    }
}