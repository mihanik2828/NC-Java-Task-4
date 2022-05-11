package SecondTask;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        Set treeSet = new TreeSet();
        Set linkedHashSet = new LinkedHashSet();

        final int countOfState=1000000;
        final int index=1;
/////////////////////////////////////////////////////////////////////////////////////////////////////
        long start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            hashSet.add(i);
        }
        long finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for HashSet "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            treeSet.add(i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for TreeSet "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            linkedHashSet.add(i);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for LinkedHashSet "+(start-finish)/1000000.0+"ms");

        System.out.println("");

/////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            hashSet.remove(i);
        }
        finish = System.nanoTime();

        System.out.println("Remove "+countOfState/2 + " elements for HashSet by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            treeSet.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("Remove "+countOfState/2 + " elements for TreeSet by index "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            linkedHashSet.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("Remove "+countOfState/2 + " elements for LinkedHashSet by index "+(start-finish)/1000000.0+"ms");

/////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("");

        start = System.nanoTime();
        hashSet.contains(1);
        finish = System.nanoTime();
        System.out.println("Get element for HashSet by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        treeSet.contains(1);
        finish = System.nanoTime();
        System.out.println("Get element for TreeSet by index "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        linkedHashSet.contains(1);
        finish = System.nanoTime();
        System.out.println("Get element for LinkedHashSet by index "+(start-finish)/1000000.0+"ms");


    }
}
