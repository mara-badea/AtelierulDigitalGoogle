package patterns.iterator;

public class ArrayCustomIterator {
    private int[] array;
    int currentPosition;

    public ArrayCustomIterator(int[] arr) {
        int k=0;
        array=new int[arr.length];
        for(int i=0; i<arr.length;i++)
        {
            array[k++]= arr[i];
        }
    }

    public boolean hasNext()
    {
            if(currentPosition>=array.length)
            {
                return false;
            }
        return true;
    }
    public int next()
    {
        if(hasNext())
        {
            currentPosition+=1;
            return array[currentPosition-1];
        }
        return 0;
    }
}
