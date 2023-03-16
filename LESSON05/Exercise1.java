package LESSON05;
import java.util.ArrayList;

public class Exercise1 {
    public static void removeInt(int number, ArrayList<Integer> arraylist){
        arraylist.remove(number);
    }
    public static void main (String[] args){
        ArrayList <Integer> arraylist = new ArrayList<>();
        for(int j= 0; j<=10; j++) {
            arraylist.add(j);
        }
        System.out.println(arraylist);
        removeInt(5,arraylist);
        System.out.println(arraylist);
    }


}