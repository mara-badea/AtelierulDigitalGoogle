//package patterns.strategy;
//
//public class BubbleSort implements SortingStrategy{
//    @Override
//    public void sort(Integer[] list)
//    {
//        int n = list.length;
//        int aux = 0;
//        for(int i=0; i < n; i++)
//        {
//            for(int j=1; j < (n-i); j++)
//            {
//                if(list[j-1] > list[j])
//                {
//                    aux = list[j-1];
//                    list[j-1] = list[j];
//                    list[j] = aux;
//                }
//            }
//        }
//    }
