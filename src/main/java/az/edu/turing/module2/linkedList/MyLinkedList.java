package az.edu.turing.module2.linkedList;

import java.util.LinkedList;
import java.util.Objects;

public class MyLinkedList<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedList(E head) {
        this.head = new Node<>(head);
        this.size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public E getData(int index) {
        Node<E> element = head;
        int searchIndex = 0;
        if (index >= getSize()) {
            System.out.println("Index out of bound");
        } else {
            while (searchIndex < index) {
                element = element.getNext();
                searchIndex++;
            }
        }
        return element.getData();
    }

    public void deleteIndex(int index) {
        Node<E> temp = head;
        int searchIndex = 0;
        if (index >= getSize()) {
            System.out.println("Index out of bound");
        } else if (index == 0) {
            deleteFirst();
        } else {
            while (index > searchIndex + 1) {
                temp = temp.getNext();
                searchIndex++;
            }
            temp.setNext(temp.getNext().getNext());
            size--;
        }

    }

    public void addTail(E data) {
        Node<E> tail = new Node<>(data);
        Node<E> element = head;
        while (element.getNext() != null) {
            element = element.getNext();
        }
        element.setNext(tail);
        this.tail = tail;
        size++;
    }

    public void addHead(E data) {
        Node<E> head = new Node<>(data);
        if (tail == null) {
            this.head = tail = head;
        } else {
            head.setNext(this.head);
            this.head = head;
            size++;
        }

    }

    public void deleteItem(E data) {
        Node<E> node = new Node<>(data);
        if (node.hashCode() == head.hashCode()) {
            deleteFirst();
        } else if (node.hashCode() == tail.hashCode()) {
            deleteLast();
        } else {
            Node<E> curr = head;
            while (curr.getNext() != null) {
                if (curr.getNext().getData() == (node.getData())) {
                    curr.setNext(curr.getNext().getNext());
                }
                curr = curr.getNext();
            }
            size--;
        }
    }


    public void update(int index, E newData) {
        Node<E> element = head;
        int searchIndex = 0;
        if (index >= getSize()) {
            System.out.println("Index out of bound");
        } else {
            while (searchIndex < index) {
                element = element.getNext();
                searchIndex++;
            }
        }
        element.setData(newData);
    }

    public void deleteFirst() {
        head = head.getNext();
        size--;
    }

    public void deleteLast() {
        Node<E> temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        tail = temp;
        temp.setNext(null);

        size--;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Node<E> curr = head;
        while (curr != null) {
            string.append(curr);
            curr = curr.getNext();
        }
        return string.toString();
    }


    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(data, node.data) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }

        @Override
        public String toString() {
            return String.format("Node{data=%s}", data);
        }
    }
}
