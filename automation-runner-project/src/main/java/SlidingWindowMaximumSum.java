public class SlidingWindowMaximumSum {
    public static void main(String[] args) {
        int[] testNumber = {500,100,200,300,700};
        int k = 2;

        int maxSum = 0;
        for(int i = 0; i<k; i++){
            maxSum += testNumber[i];
        }
        int windowSum = maxSum;
        for(int j=k; j<testNumber.length; j++){
            windowSum += testNumber[j] - testNumber[j-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        System.out.println(maxSum);
    }
}
