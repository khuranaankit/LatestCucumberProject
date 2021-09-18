import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramsOfSecondStringInFirstStringUsingSlidingWindow {
    public static List<Character> al1 = new ArrayList<Character>();
    public static List<Character> al2 = new ArrayList<Character>();
    public static void main(String[] args) {
        String testString = "xyzabzyxzxy";

        String testStringSecond = "xyz";
        int k = testStringSecond.length();
        for(int j = 0; j<testStringSecond.length();j++)
        al2.add(testStringSecond.charAt(j));


        for(int i=0; i<testStringSecond.length();i++){
            al1.add(testString.charAt(i));
            if(al1.containsAll(al2)){
                System.out.println("Anagram " + testString.substring(0, testStringSecond.length()) +
                        " present at index 0");

            }
        }

        for(int l=testStringSecond.length(); l<testString.length();l++){

            al1.remove(0);

            while(al1.size()<testStringSecond.length()){
                al1.add(testString.charAt(l));
            }

            if(al1.containsAll(al2)){
                System.out.println("Anagram " + testString.substring(l - testStringSecond.length()+1, l+1) +
                        " present at index " + (l - testStringSecond.length()+1) + " and value of l " + l);

            }



        }
    }
}
