import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Linklist {
    public static void main (String []args){
        //Question 1
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> linklist = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        System.out.print("Enter value to input into list: ");
        int inputValue = scan.nextInt();
        addAndSort(linklist, inputValue);

        //Question 2
        System.out.println("Enter two index to swap.");
        System.out.print("Index One: ");
        int indexOne = scan.nextInt();
        System.out.print("Index Two: ");
        int indexTwo = scan.nextInt();
        swapValues(linklist, indexOne, indexTwo);

        //Question 3
        Random rand = new Random();
        LinkedList<Integer> randomList = new LinkedList<Integer>(); //create new linked list
        int randomVal=rand.nextInt(1000,9999); //generate random value within the same range
        findValue(randomList, randomVal);
    }

    //Question 1
    public static void addAndSort(LinkedList<Integer> list,int value){
        System.out.println("Before change: " + list);
        for(int i=0;i<list.size();i++)
        {
            if(value<list.get(i))
            {
                list.add(i,value); //add value to index i
                System.out.println("After change: " + list);
                return;
            }
        }
        list.add(value); //add value to first index 
        System.out.println("After adding: " + list);
    }

    //Question 2
    public static void swapValues(LinkedList<Integer>list,int indexOne,int indexTwo){
        System.out.println("Before swapping: " + list);
        int temp;
        temp = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo,temp);
        System.out.println("After swapping: " + list);
    }

    //Question 3
    public static void findValue(LinkedList<Integer>list,int searchVal){
        Random rand = new Random();
        for (int i=0;i<500;i++){
            list.add(rand.nextInt(1000,9999));
        }
        if (list.indexOf(searchVal)>= 0){
            //System.out.println("Random search value is: " + searchVal);
            System.out.println("Random search value exists at index "+ list.indexOf(searchVal));
        }
        else {
            //System.out.println("Random search value does not exist in random link list.");
            System.out.println("-1");
        }
    }
}