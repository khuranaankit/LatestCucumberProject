import java.util.Stack;

public class SlidingWindowMaximum {

    /* prints element and NGE pair for
       all elements of arr[] of size n */
    static void printNGE(int arr[], int n, int k)
    {
        int i = 0;
        int element, next;

        /* push the first element to stack */

        //int[] slidingMaxArray = new int[n-k];

        for (i = 0; i <= n-k; i++)
        {
            int counter=i;
            int max=arr[counter];
            while(counter<i+k-1){

                if(arr[counter+1]>max){
                    max=arr[counter+1];
                }
                counter++;
            }
            System.out.print(max+" ");

        }

    }

    // Driver Code
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
       // System.out.println(s.peek());
        int arr[] = { 11, 3, 10, 13 ,27, 4, 10, 30};
        int n = arr.length;
        int k =4;
        printNGE(arr, n, k);
    }
}
