import org.bouncycastle.util.Arrays;

public class ReplaceZeroWithOneToGetMaximumOnes {
    static void findLongestSequence(int[] s, int requiredWindowSize){

        int curr_start = 0;

        int max_windowSize = 0;
        int max_windowStart = 0;
        int count = 0;
        for(int j=0; j<s.length; j++){

            if(s[j]==0) {
                count++;
            }

            while(count> requiredWindowSize){
                if(s[curr_start]==0) {
                    count--;
                }
                curr_start++;
            }

            if(j-curr_start+1>max_windowSize)
            {
                max_windowSize = j-curr_start+1;
                max_windowStart = curr_start;
            }
        }

        System.out.println("The longest sequence has length " + max_windowSize +
                " from index " + max_windowStart + " to " + (max_windowStart + max_windowSize - 1));

    }
        public static void main(String[] args) {
            int[] A = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 };
            int k = 1;

            findLongestSequence(A, k);

    }
}
