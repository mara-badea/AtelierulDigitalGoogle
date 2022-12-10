package basics.ch4;


import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] lista={-1,-1,-1,-1,2,2,-4,2,2};
        HashSet<Pair> unique=new HashSet<Pair>();
        Arrays.sort(lista);
        for(int i=0;i< lista.length;i++)
        {
            for(int j=i+1;j<lista.length;j++)
            {
                for(int k=j+1;k< lista.length;k++)
                {
                    if(lista[i]+lista[j]+lista[k]==0)
                    {
                        unique.add(new Pair(lista[i],lista[j],lista[k]));
                    }
                }
            }
        }
        Iterator itr = unique.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }
}
