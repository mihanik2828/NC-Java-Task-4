package FirstTask.myLinkedList;

public class Node<E> {
    private E element;
    private Node<E> nextNode;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +'}';
    }

    public Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public void deleteNode()
    {
        this.element=null;
        this.nextNode=null;
    }

    public Node(E element) {
        this.element = element;
    }
}
