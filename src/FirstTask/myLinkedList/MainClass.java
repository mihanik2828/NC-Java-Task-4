package FirstTask.myLinkedList;

public class MainClass {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        MyLinkedList linkedList1 = new MyLinkedList();
        Parent parent1 = new Parent(1,"Mikol");
        Parent parent2 = new Parent(2,"Roma");
        Parent parent3 = new Parent(3,"Sergey");
        Parent parent4 = new Parent(4, "Yana");
//////////////////////////////add///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("Add test ");
        linkedList.add(parent1);
        linkedList.add(parent2);
        linkedList.add(parent3);

        linkedList.printList();

//////////////////////////////add by index///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("Add by index test ");
        linkedList.add(2,parent4);
        linkedList.printList();
//////////////////////////////remove by index///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("Remove by index test ");
        linkedList.remove(2);
        linkedList.printList();
//////////////////////////////get by index///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("Get by index test ");
        System.out.println(linkedList.get(0));

//////////////////////////////indexOf///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("IndexOf test ");
        System.out.println("Index of parent1 "+linkedList.indexOf(parent1));
        System.out.println("Index of parent4 "+linkedList.indexOf(parent4));

//////////////////////////////set///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("Set by index test ");
        linkedList.set(0,parent4);
        linkedList.printList();

//////////////////////////////indexOf///////////////////////////////////
        System.out.println("*********************************************************");
        System.out.println("Size test ");
        System.out.println("Size is " + linkedList.size());


/////////////////////////////<T> T[] toArray(T[] a)///////////////////
        System.out.println("*********************************************************");
        System.out.println("<T> T[] toArray(T[] a) test ");
        Parent[] array = new Parent[linkedList.size()];
        Object[] array1 = linkedList.toArray(array);
        for(int i =0 ; i< linkedList.size();i++)
            System.out.println(array1[i]);


///////////////////////////// Object[] toArray()///////////////////
        System.out.println("*********************************************************");
        System.out.println(" Object[] toArray() test ");
        Object[] listToArray=  linkedList.toArray();
        for(int i =0 ; i< linkedList.size();i++)
            System.out.println(listToArray[i]);

///////////////////////////////////////forEachTest///////////////////////
        System.out.println("*********************************************************");
        System.out.println("Foreach test ");
        for(Object i : linkedList)
            System.out.println(i);

///////////////////////////////////////clear///////////////////////
        System.out.println("*********************************************************");
        System.out.println("Clear test ");
        linkedList.clear();
        linkedList.printList();
        System.out.println("Temporary size is "+linkedList.size());
        System.out.println();
        linkedList.add(parent2);
        linkedList.add(parent3);
        linkedList.printList();
        System.out.println("Temporary size is "+linkedList.size());
    }
}
