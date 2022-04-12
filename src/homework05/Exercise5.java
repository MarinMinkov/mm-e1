package homework05;

import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {

        LinkedList <Integer> list1 = new LinkedList<>();
        LinkedList <Integer> tmpList = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // Reversing with a second list.
        for (int i = list1.size()-1; i >= 0; i--)
        {
            tmpList.add(list1.get(i));
        }

        list1 = tmpList;
        System.out.println(list1);

        // Reversing with a variable.
        for (int i = 0, tmp; i < list1.size() / 2; i++)
        {
            tmp = list1.get(i);
            list1.set( i , list1.get (list1.size() -1 - i));
            list1.set (list1.size() -1 - i, tmp);
        }

        System.out.println(list1);
    }
}
