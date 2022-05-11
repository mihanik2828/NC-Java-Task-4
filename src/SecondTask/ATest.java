package SecondTask;



import java.util.ArrayList;
import java.util.LinkedList;

public class ATest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        final int countOfState=1000000;
        final int index=countOfState/2;
/////////////////////////////////////////////////////////////////////////////////////////////////////
        long start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            arrayList.add(index);
        }
        long finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for ArrayList "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            linkedList.add(index);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for LinkedList "+(start-finish)/1000000.0+"ms");

/////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            arrayList.add(index,i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for ArrayList by index "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            linkedList.add(index,i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for LinkedList by index "+(start-finish)/1000000.0+"ms");
/////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("");

        start = System.nanoTime();

        for(int i =0 ; i<countOfState ; i++)
        {
            arrayList.remove(((index*2-i)/2));
        }
        finish = System.nanoTime();

        System.out.println("Remove "+countOfState/2 + " elements for ArrayList by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            linkedList.remove((index*2-i)/2);
        }
        finish = System.nanoTime();
        System.out.println("Remove "+countOfState/2 + " elements for LinkedList by index "+(start-finish)/1000000.0+"ms");


/////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("");

        start = System.nanoTime();
        arrayList.get(index);
        finish = System.nanoTime();
        System.out.println("Get element for ArrayList by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        linkedList.get(index);
        finish = System.nanoTime();
        System.out.println("Get element for LinkedList by index "+(start-finish)/1000000.0+"ms");

    }
}
