import java.util.Arrays;

public class AllAnagramsOfSecondStringInFirstString {

    public static void main(String[] args) {
        String testString = "xyzabzyxzxy";
        String testStringSecond = "xyz";
        int k = testStringSecond.length();
        for(int i=0; i<=testString.length()-k;i++){
            if(sortChars(testString.substring(i,i+k)).equals(sortChars(testStringSecond))){
                System.out.println("Anagram 'xyz' present at " + i);
            }
        }
    }
    public static String sortChars(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
