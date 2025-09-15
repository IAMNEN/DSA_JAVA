import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();


        //add element in array list
        list.add(0);
        list.add(1);

        System.out.println(list);

        //fetch element using index number
        int element = list.get(0);
        System.out.println(element);

        //add in given index number
        list.add(2, 2);
        System.out.println(list);

        //replace value in given index number
        list.set(0, 5);
        System.out.println(list);

        //remove element using index number
        list.remove(2);
        System.out.println(list);

        //find size of Arraylist
        int size = list.size();
        System.out.println(size);

        //fetch element using For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //shorting array list 
        Collections.sort(list);
        System.out.println(list);

    }
}