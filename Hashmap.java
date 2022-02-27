import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;

public class Hashmap {
    public static void main(String[] args){
        //Question 4
        Scanner scan = new Scanner(System.in);
        HashMap <Integer, Integer> hashmap = new HashMap<Integer,Integer>();
        hashmap.put(0,1);
        hashmap.put(1,3);
        hashmap.put(2,5);
        hashmap.put(3,7);
        hashmap.put(4,9);
        hashmap.put(5,11);
        System.out.print("Enter value to input into hashmap: ");
        int inputValue = scan.nextInt();
        addAndSort(hashmap,inputValue);

        //Question 5
        System.out.println("Enter two index to swap.");
        System.out.print("Index one: ");
        int indexOne = scan.nextInt();
        System.out.print("Index two: ");
        int indexTwo = scan.nextInt();
        swapValues(hashmap,indexOne,indexTwo);

        //Question 6
        Random rand=new Random();
        HashMap<Integer,Integer>randomMap= new HashMap<Integer,Integer>();
        int randomVal=rand.nextInt(1000,9999);
        findValue(randomMap,randomVal);
    }

    //Question 4
    public static void addAndSort(HashMap<Integer,Integer>hashmap,int value){
        System.out.println("Before change: " + hashmap);
        hashmap.put(hashmap.size(),value);
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 1; i < hashmap.size(); i++){
                if(hashmap.get(i) < hashmap.get(i - 1)){
                    int temp;
                    temp = hashmap.get(i);
                    hashmap.put(i,hashmap.get(i-1));
                    hashmap.put(i-1,temp);
                    sorted = false;
                }
            }
        }
        System.out.println("After change: " + hashmap);
    }

    //Question 5
    public static void swapValues(HashMap<Integer,Integer>hashmap,int indexOne,int indexTwo){
        System.out.println("Before swapping: " + hashmap);
        int temp;
        temp=hashmap.get(indexOne);
        hashmap.put(indexOne,hashmap.get(indexTwo));
        hashmap.put(indexTwo,temp);
        System.out.println("After swapping: " + hashmap);
    }

    //Question 6
    public static void findValue(HashMap<Integer,Integer>hashmap,int searchVal){
        Random rand=new Random();
        for (int i=0;i<500;i++){
            hashmap.put(i,rand.nextInt(1000,9999));
        }
        if (hashmap.containsValue(searchVal)){
            //System.out.println("Random search value is: " + searchVal);
            System.out.println("Random search value exists at index " + hashmap.containsKey(searchVal));
        }
        else {
            //System.out.println("Random search value does not exist in random hashmap.");
            System.out.println("-1");
        }
    }
}