package ss10_dsa_danh_sach.exercise.java_util_linkedlist;


import jdk.nashorn.internal.ir.WhileNode;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;// temp.next tại vị trí index .next => trỏ tới holder
        numNodes++;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;
        E data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new IllegalArgumentException("MylinkedList nay null");
        } else {
            MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
            Node temp = head;
            returnLinkedList.addFirst((E) temp.data);
            temp = temp.next;
            while (temp != null) {
                returnLinkedList.addLast((E) temp.data);
                temp = temp.next;
            }
            return returnLinkedList;
        }
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public E getFirst() {
        return  head.data;
    }

    public E getLast() {
        Node temp = head;
        Node temp2 = head;
        while (temp != null) {
            if (temp.data != null) {
                temp2 = temp;
            }
            temp = temp.next;
        }
        return temp2.data;
    }

    public void clear() {
        Node temp = head;
        while (temp != null) {
            temp.data = null;
            temp = temp.next;
        }
    }
}
