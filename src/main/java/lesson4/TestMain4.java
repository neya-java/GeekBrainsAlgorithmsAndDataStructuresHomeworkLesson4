package lesson4;

import java.util.*;
import java.util.LinkedList;

public class TestMain4 {

    private static TwoSideLinkedList<Integer> linkedList;

    public static void main(String[] args) {
//        testLinkedList();
//        testHomeWork();
        testIterator();
    }

    private static void testLinkedList() {
//        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList = new TwoSideLinkedListImpl<>();

        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.insertFirst(8);
        linkedList.insertLast(9);
        linkedList.insertLast(10);
        linkedList.insertLast(11);

        linkedList.display();

        System.out.println("Find 2: " + linkedList.contains(2));
        System.out.println("Find 1: " + linkedList.contains(1));
        System.out.println("Find 4: " + linkedList.contains(4));
        System.out.println("Find 4444: " + linkedList.contains(4444));

        linkedList.removeFirst();
        linkedList.remove(4);

        linkedList.display();

    }

    private static void testHomeWork() {
        //ДОЛЖНО РАБОТАТЬ! Iterable - LinkedListIterator impl Iterator

/*        for (Integer value : linkedList) {
            System.out.println("value: " + value);
        }*/
    }


    private static void testIterator() {
        List<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 1, 2, 3, 4, 5, 6, 7 );

/*        for (Integer integer : integerList) {
            System.out.println(integer);
        }*/

//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            Integer integer = iterator.next();
//            System.out.println(integer);
//        }


    }
}
