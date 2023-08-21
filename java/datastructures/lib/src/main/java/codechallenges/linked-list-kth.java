package codechallenges;

import datastructures.linkedlist.LinkedList;


public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void append(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    public int kthFromEnd(int k) throws Exception {
        if (k < 0) {
            throw new Exception("k must be a positive integer");
        }

        Node firstPointer = head;
        Node secondPointer = head;

        for (int i = 0; i <= k; i++) {
            if (firstPointer == null) {
                throw new Exception("k is greater than the length of the linked list");
            }
            firstPointer = firstPointer.next;
        }

        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return secondPointer.value;
    }
}