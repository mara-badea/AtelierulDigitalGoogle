package basics.ch4;

import java.util.Objects;

public class Pair {
   private int a, b, c;
    public Pair(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public String toString()
    {
        return("["+a+", "+b+", "+c+"]");
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(a,b,c);
    }
    @Override
    public boolean equals(Object o)
    {
        if(this==o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Pair pair = (Pair) o;
        return a == pair.a && b == pair.b&& c==pair.c;
    }

}
