package LinkedList;

import java.util.*;

//Using Collectionframework
public class Singlylinkedlist2 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.addFirst("a");
        l.addFirst("b");
        l.add("c");
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
        // l.size()
        // l.get(i)
        // l.remove(i)
    }

}
