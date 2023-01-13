package patterns.strategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort implements SortingStrategy
{
    @Override
    public void sort(Integer[] list) {
        Arrays.sort(list);
    }
}
