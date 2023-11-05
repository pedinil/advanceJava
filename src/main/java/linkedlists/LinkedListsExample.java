package linkedlists;

import java.util.LinkedList;

public class LinkedListsExample {

  public static void main(String[] args) {

    // LinkedList when operations like data addition or deletion
    // occur more frequently than reading the data

    LinkedList<String> list = new LinkedList<>();
    list.add("first item");
    list.add("second item");
    System.out.println(list);

    System.out.println(list.getFirst());
    System.out.println(list.getLast());

    // remmove the head of list and return it , return null if item is not exists
    System.out.println(list.pop());
    System.out.println(list);

    // remmove the head of list and return it
    System.out.println(list.poll());
    System.out.println(list);

    System.out.println(list.poll());
    System.out.println(list.pop());
  }
}
