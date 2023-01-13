package collections.arraylist;

import java.util.*;

public class Main {
    public static void useArrayList() {
        List list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Empty");
        list.add("Something");
        System.out.println(list);
    }

    public static void main(String[] args) {
        useArrayList();
    }
}
