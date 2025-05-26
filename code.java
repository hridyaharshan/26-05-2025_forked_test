public class code{

    // Print array method
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static boolean palin(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
    public static void main(String[] args)
    {
        int n = 8;
        // array with N size
        int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 };

        int evenSize = 0;
        int oddSize = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                evenSize++;
            else
                oddSize++;
        }
        // odd and even arrays with size
        int[] even = new int[evenSize];
        int[] odd = new int[oddSize];
        // odd and even array iterator
        int j = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even[j++] = array[i];
            else
                odd[k++] = array[i];
        }

        System.out.println();
        for(int i=0;i<even.length;i++)
        {
            if(palin(even[i]))
            {
                System.out.println(even[i]);
            }
        }
        System.out.println();


        for(int i=0;i<odd.length;i++)
        {
            if(palin(odd[i]))
            {
                System.out.println(odd[i]);
            }
        }
        // print array method
        System.out.print("Even Array contains: ");
        printArray(even);
        System.out.print("Odd Array contains: ");
        printArray(odd);
    }
}