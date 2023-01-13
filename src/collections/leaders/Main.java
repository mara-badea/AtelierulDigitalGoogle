package collections.leaders;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        List list2 = new ArrayList<>();
        int ct = 0;
        int k=0;
        list.add(53);
        list.add(23);
        list.add(22);
        list.add(2);
        list.add(11);
        list.add(5);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(0);
        list2 = List.copyOf(list);
        Iterator<Integer> it = list.iterator();
        Iterator<Integer> it2 = list2.iterator();
        Integer currInt;

        while(it.hasNext())
        {
            Integer a=it.next();
            k++;
            while(it2.hasNext()) {
                Integer b = it2.next();

                if (a >= b) {
                    ct++;
                } else
                {
                    ct = 0;
                    it2 = list2.iterator();
                    for(int i=0;i<k;i++)
                    {
                        it2.next();
                    }
                    break;
                }
            }
            if(ct!=0)
            {
                System.out.println(a + " Is Leader");
                ct = 0;
                it2 = list2.iterator();
                for(int i=0;i<k;i++)
                {
                    it2.next();
                }
            }
        }
    }
}
