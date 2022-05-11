package FirstTask.myLinkedList;

import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E>{

    private Node<E> head;
    private Node<E> last;

    private int size=0;

    @Override
    public String toString() {
        return head==null?"MyLinkedList{}":"MyLinkedList" +
                "\n\thead=" + head.toString() +
                "\n\tlast=" + last.toString() ;
    }

    public void printList()
    {
       // System.out.println("________________________________");
        System.out.println(toString());
        forEach(System.out::println);
       // System.out.println("________________________________");
    }

    public MyLinkedList() {
    }

////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void add(E element) {
        if (checkIsNullHead()) {
            head = new Node(element);
            last = head;
        }
        else {
            last.setNextNode(new Node<E>(element));
            last=last.getNextNode();
        }
        last.setNextNode(null);
        size++;
    }

    @Override
    public void add(int index, E element) {
        this.checkIndexOfBound(index);


        if(index==0)
            setHead(new Node<E>(element));
        else if(index==size())
            setLast(new Node<E>(element));
        else {
            Node<E> temp = getNode(index-1);
            temp.setNextNode(new Node<E>(element, temp.getNextNode()));
        }
        size++;
    }

    @Override
    public void clear() {
        for(Node<E> temp=head;temp!=null;)
        {
            Node<E> prev = temp;
            temp=temp.getNextNode();
            prev.setNextNode(null);
            prev.setElement(null);
        }
        head=null;
        last=null;
        size=0;
    }

    @Override
    public E get(int index) {
        this.checkIndexOfBound(index);
        Node<E> temp=head;
        for(int i =0 ; i<index ; i++)
            temp=temp.getNextNode();
        return temp.getElement();
    }

    @Override
    public int indexOf(E element) {

        if(checkIsNullHead())
            return -1;

        Node<E> temp=head;

        for(int i=0;i<size();i++)
        {
            if(temp.getElement()==element)
                return i;
            temp=temp.getNextNode();
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        checkIndexOfBound(index);
        if (index==0) {size--;return delHead();}
        if (index==size-1) {size--;return delLast();};

        Node<E> temp = getNode(index-1);

        temp.setNextNode(temp.getNextNode().getNextNode());
        size--;
        return temp.getNextNode().getElement();
    }

    @Override
    public E set(int index, E element) {
        checkIndexOfBound(index);
        if (index==0) {delHead();setHead(new Node<E>(element));return element;}
        if (index==size) {delLast(); setLast(new Node<E>(element));return element; };
        this.getNode(index).setElement(element);
        return element;
    }

    @Override
    public int size() {
        /*if (head==null) return 0;
        Node temp=head;
        int size=1;
        while (temp!=last) {
            size++;
            temp=temp.getNextNode();
        }*/
        return size;
    }

    @Override
    public Object[] toArray() {

        Object[] array = new Object[size()];
        int i=0;
        for(Node<E> node=head ;node!=null ; i++,node=node.getNextNode())
            array[i]=node.getElement();
        return array;
    }

    @Override
    public <T> T[] toArray(T[] elements) {
        T[] array;
        if(elements.length < size) {
            elements = (T[])new Object[size];
        }
        int i=0;
        Object[] result = elements;
        for(Node<E> node= head ;node!=null ; i++,node=node.getNextNode())
          result[i]=node.getElement();

        return elements;
    }

    ////////////////////////////////////////Iterator////////////////////////////////////////////////////////

    @Override
    public Iterator iterator() {
        return new Iterator(head);
    }

    @Override
    public void forEach(Consumer action) {
        if(checkIsNullHead()) return;
        Node<E> temp=head;
        Iterator<E> iterator = this.iterator();
        while(iterator.hasNext())
        {
            //temp=temp.getNextNode();
            action.accept(iterator.next());
        }
    }


    class Iterator<E> implements java.util.Iterator<E> {

        Node<E> current;

        public Iterator(Node<E> current) {
            this.current=current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            Node<E> temp = current;
            current=current.getNextNode();
            return temp.getElement();
        }
    };


    ////////////////////////////////////////Help Methods////////////////////////////////////////////////////////

    private void checkIndexOfBound(int k){if(this.size() < k || k<0) throw new IndexOutOfBoundsException();}

    private boolean checkIsNullHead(){return head==null;};

    private void bindOneWithTwo(Node<E> one , Node<E> two) { one.setNextNode(two); }

    private void setHead(Node<E> newHead){ newHead.setNextNode(head);size++; head=newHead;}

    private void setLast(Node<E> newLast){ last.setNextNode(newLast); size++;last=newLast; last.setNextNode(null);}

    private E delHead(){Node<E> temp= head ;head=head.getNextNode();size--; return temp.getElement();}

    private E delLast(){Node<E> temp= head ;last=getNode(size-1);size--;last.setNextNode(null) ; return temp.getElement();}

    private Node<E> getNode(int index) {
        this.checkIndexOfBound(index);
        Node<E> temp=head;
        for(int i =0 ; i<index ; i++)
            temp=temp.getNextNode();
        return temp;
    }

}
