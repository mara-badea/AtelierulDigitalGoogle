package basics.ch3;
public class Main {
    public static int[] removeDuplicates(int[] myArray)
    {
        int[] newArray = new int[myArray.length];
        int nr=0;

        for(int i = 0 ; i<myArray.length; i++)
        {
            boolean added = false;
            for(int j=0; j<nr; j++)
            {
                if(myArray[i] == newArray[j])
                {
                    added=true;
                }
            }
            if(added == false)
            {
                newArray[nr++]=myArray[i];
            }
        }
        return newArray;
    }
//    private static Pair[] createPairs(int[] newArray)
//    {
//        int contor=0;
//        //Pair[] pairs = new Pair[nr-1];
//    }

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -3, -2, 3, 0};

        for(int i=0;i<myArray.length;i++)
        {
            System.out.print(myArray[i] + " ");
        }

        int[] newArray = removeDuplicates(myArray);
        System.out.println(" ");
       // for(int i=0;i<nr;i++)

    }
}
