public class Maximum 
{
    static int count = 0;
    static boolean compare(int x, int y){
        count++;
        return x > y;
    }
    public static int maxima(int [] array)
    {
        int m = 0;
        int i=1;
        while ( compare(i,array.length))
        {
            if (compare(array[i] , array[m]))
            {
                m = i;
            } 
            i++;
        }
        return m;
    }
    public static int maximum(int [] array)
    {
        int temmaximum = array[0];
        int i=1;
        while ( compare(i,array.length))
        {
            if (compare(array[i] , temmaximum))
               temmaximum = array[i];
            i++;
        }
         
        return temmaximum;
    }
    // test driver
        public static int minima(int [] array)
    {
        int maximum = array[0];
        int i=1;
        while ( compare(i,array.length))
        {
            if (compare(array[i] , maximum))
               maximum = array[i];
            i++;
        }
         
        return maximum;
    }
        public static void outputCount() {
            System.out.println("Count: " + count);
        }
    public static void main(String[] args) 
    {
       int [] arr = new int[]{342,34,233,456};
       System.out.println(maximum(arr));
       System.out.println(maxima(arr));
       System.out.println(minima(arr));
       outputCount();
    }

}