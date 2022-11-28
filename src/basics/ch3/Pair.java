package basics.ch3;

import java.util.Objects;

public class Pair {
    private int a;
    private int b;
    public Pair(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public boolean equals(Object o)
    {
        if(this==o)
            return true;
        if(o == null || getClass() != o.getClass())
            return false;
        Pair pair = (Pair) o;
        return a == pair.a && b == pair.b;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(a,b);
    }

    @Override
    public String toString()
    {
        return "[" + a + "," + b + "]";
    }
}
