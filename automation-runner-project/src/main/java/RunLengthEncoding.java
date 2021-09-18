public class RunLengthEncoding {
    private static void printRLE(String testString) {
        int count;
        String temp = "";
        int i;

        for (i = 0; i < testString.length(); i++) {
            count = 1;
                    while(i< testString.length()-1 && testString.charAt(i) == testString.charAt(i+1)){
                        count++;
                        i++;
                    }
                        temp += String.valueOf(testString.charAt(i)) + count;
            }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        String testString = "aaabbbaacccdduuud";
        //output:a3b3a2c3d2u3d1
        printRLE(testString);

    }
}
