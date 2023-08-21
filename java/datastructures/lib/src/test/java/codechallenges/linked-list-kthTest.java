package codechallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(8);
        ll.append(2);

        try {
            System.out.println(ll.kthFromEnd(0)); 
            System.out.println(ll.kthFromEnd(2)); 
            System.out.println(ll.kthFromEnd(6));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        LinkedList ll2 = new LinkedList();
        ll2.append(42);
        try {
            System.out.println(ll2.kthFromEnd(0)); 
            System.out.println(ll2.kthFromEnd(1)); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(ll.kthFromEnd(-3)); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All tests passed!");
    }
}