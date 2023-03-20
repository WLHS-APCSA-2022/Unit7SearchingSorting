
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
        int location = binarySearch(numList,25);
    }
    //write the binary search to look for 25
    //find the middle
    //is target less than or greater than middle
    //if less, get rid of middle and elements to right
    //else get rid of middle and elements to left
    //repeat until you are left with one element
    //if that element is target, return it, else return -1

    /**
     * Uses a binary search to find an integer in a list
     *
     * @param list list you are searching
     * @param target number you want to find
     * @return index of the target or -1 if it is not found
     */
    public static int binarySearch(ArrayList<Integer> list, int target){
        int middle;
        double index;
        int length = list.size();
        if(length%2 == 1){
            index = length/2.0;
            middle = list.get(length/2);
        } else{
            index = length/2.0 - 0.5;
            middle = (list.get(length/2-1)+list.get(length/2))/2;
        }

        if(target == middle){
            return (int)(index);
        }
        if(target < middle){

        } else{

        }

        return -1;
    }

}