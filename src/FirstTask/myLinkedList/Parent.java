package FirstTask.myLinkedList;

public class Parent {
    int a;
    String name = "John";

    public Parent(int a) {
        this.a = a;
    }

    public Parent(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public void doSomething()
    {
        System.out.println("Me is "+toString() + ", i can do something");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
