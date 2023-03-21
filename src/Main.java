
import java.util.ArrayList;
import java.util.Collections;

//Insertion Sort Video - https://youtu.be/lCDZ0IprFw4?list=PLptNlaurO6h0X0Brwg1tHpmDnDi6fNvmM
//Selection Sort Video - https://youtu.be/cqh8nQwuKNE?list=PLptNlaurO6h0X0Brwg1tHpmDnDi6fNvmM

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
        System.out.printf("The number 25 was found at " + location);

        int[] listToSort = {7,8,5,4,9,2};
        System.out.println("\n\nOriginal list");
        for(int n:listToSort){
            System.out.print(n + " ");
        }
        selectionSort(listToSort);
        System.out.println("\nSorted list");
        for(int n:listToSort){
            System.out.print(n + " ");
        }

        int[] listToSort2 = {5,8,1,3,9,6};

        System.out.println("\n\nOriginal list");
        for(int n:listToSort2){
            System.out.print(n + " ");
        }
        insertionSort(listToSort2);
        System.out.println("\nSorted list");
        for(int n:listToSort2){
            System.out.print(n + " ");
        }
    }

    private static void insertionSort(int[] arr) {
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > key){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }

        }
    }

    /**
     * Uses a binary search to find an integer in a list
     *
     * @param list list you are searching
     * @param target number you want to find
     * @return index of the target or -1 if it is not found
     */
    public static int binarySearch(ArrayList<Integer> list, int target){

        //set lower and upper boundaries
        int lower = 0;
        int upper = list.size() - 1;

        //while the lower is not the upper
        while(lower <= upper){
            //set midpoint index
            int mid = (lower + upper) / 2;
            //if value at mid is target return mid
            if(list.get(mid) == target){
                return mid;
            }
            else if(list.get(mid) < target){ //if value at mid is less than target, make lower mid + 1
                lower = mid + 1;
            }
            else { //if value at mid is greater than target, make upper mid - 1
                upper = mid - 1;
            }
        }
        return -1;
    }


    public static void selectionSort(int[] arr){
        int len = arr.length;

        for(int i = 0; i<len-1; i++){
            int minIndex = i;
            for(int j = i + 1; j<len; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap here
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}