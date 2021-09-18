import org.bouncycastle.util.Arrays;

public class SlidingWindowMaxSubstring {
    final static int MAX_CHARS = 26;


    static boolean isValid(int count[], int k){
        int val = 0;
        for(int i =0; i<MAX_CHARS; i++){
            if (count[i]>0) {
                val++;
            }
        }
        return (k>=val);
    }

    static void kUniques(String s, int requiredWindowSize){
    int curr_start = 0, curr_end = 0, k=requiredWindowSize;

    int max_windowSize = 1;
    int max_windowStart = 0;

    int[] count = new int[MAX_CHARS];
    Arrays.fill(count,0);

    count[s.charAt(0) - 'a']++;

        for(int j=1; j<s.length(); j++){

        count[s.charAt(j) - 'a']++;
        curr_end++;

        while(!isValid(count, k)){
            count[s.charAt(curr_start) - 'a']--;
            curr_start++;
        }

        if(curr_end-curr_start+1>max_windowSize)
        {
            max_windowSize = curr_end-curr_start+1;
            max_windowStart = curr_start;
        }
    }

        System.out.println("Max substring is : " + s.substring(max_windowStart, max_windowStart + max_windowSize)
            + " with length " + max_windowSize);

}
    public static void main(String[] args) {
        String s = "ababcbcbcdababcabccab";
        int k = 3;
        kUniques(s, k);

    }
}
