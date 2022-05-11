package FirstTask.myLinkedList;

import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        LinkedList linkedList = new LinkedList();
        final int countOfState=1000000;

        long start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            myLinkedList.add(i);
        }
        long finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for MyLinkedList "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            linkedList.add(i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for LinkedList "+(start-finish)/1000000.0+"ms");


        System.out.println("");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            myLinkedList.add(10,i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for MyLinkedList by index "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            linkedList.add(10,i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for LinkedList by index "+(start-finish)/1000000.0+"ms");

        System.out.println("");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            myLinkedList.remove(0);
        }
        finish = System.nanoTime();

        System.out.println("Remove "+countOfState/2 + " elements for MyLinkedList by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            linkedList.remove(0);
        }
        finish = System.nanoTime();
        System.out.println("Remove "+countOfState/2 + " elements for LinkedList by index "+(start-finish)/1000000.0+"ms");


        System.out.println("");

        start = System.nanoTime();
            myLinkedList.get(10);
        finish = System.nanoTime();
        System.out.println("Get element for MyLinkedList by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        linkedList.get(10);
        finish = System.nanoTime();
        System.out.println("Get element for LinkedList by index "+(start-finish)/1000000.0+"ms");
    }
}
