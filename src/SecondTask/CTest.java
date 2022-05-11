package SecondTask;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CTest {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        Map treeMap = new TreeMap();
        Map linkedHashMap = new LinkedHashMap();

        final int countOfState=10000000;
/////////////////////////////////////////////////////////////////////////////////////////////////////
        long start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            hashMap.put(i,countOfState-1);
        }
        long finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for HashMap "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            treeMap.put(i,countOfState-1);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for TreeMap "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState ; i++)
        {
            linkedHashMap.put(i,countOfState-1);
        }
        finish = System.nanoTime();
        System.out.println("Add "+countOfState+" elements for LinkedHashMap "+(start-finish)/1000000.0+"ms");

        System.out.println("");

/////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            hashMap.remove(i);
        }
        finish = System.nanoTime();

        System.out.println("Remove "+countOfState/2 + " elements for HashMap by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            treeMap.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("Remove "+countOfState/2 + " elements for TreeMap by index "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        for(int i =0 ; i<countOfState/2 ; i++)
        {
            linkedHashMap.remove(i);
        }
        finish = System.nanoTime();
        System.out.println("Remove "+countOfState/2 + " elements for LinkedHashMap by index "+(start-finish)/1000000.0+"ms");

/////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("");

        start = System.nanoTime();
        hashMap.get(countOfState/2);
        finish = System.nanoTime();
        System.out.println("Get element for HashMap by index "+(start-finish)/1000000.0+"ms");

        start = System.nanoTime();
        treeMap.get(countOfState/2);
        finish = System.nanoTime();
        System.out.println("Get element for TreeMap by index "+(start-finish)/1000000.0+"ms");


        start = System.nanoTime();
        linkedHashMap.get(countOfState/2);
        finish = System.nanoTime();
        System.out.println("Get element for LinkedHashMap by index "+(start-finish)/1000000.0+"ms");


    }
}
