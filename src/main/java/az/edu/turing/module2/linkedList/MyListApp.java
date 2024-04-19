package az.edu.turing.module2.linkedList;

public class MyListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList=new MyLinkedList<Integer>(5);
        linkedList.addTail(4);
        linkedList.addTail(3);
        linkedList.addHead(3);
        linkedList.update(2,9);
        System.out.println(linkedList.getData(2));
        System.out.println(linkedList.getSize());

        System.out.println(linkedList);
    }
}
