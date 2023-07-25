package challenges;

import linkedlist.LinkedList;

public class LinkedListChallenges
{
  LinkedList linkedList;

  public LinkedListChallenges()
  {
    linkedList = new LinkedList();
  }

  public void linkedListChallenge06()
  {
    linkedList.insert(10);
    linkedList.insert(20);
    linkedList.insert(30);
    System.out.println("Includes 20? " + linkedList.includes(20));
    System.out.println("Includes 50? " + linkedList.includes(50));
    System.out.println("LinkedList: " + linkedList.toString());
  }
}
