public class SwapTwoStringsWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String first = "first";
        String second = "second";


        swapStrings(first, second);
    }

    private static void swapStrings(String first, String second) {
        second = second + first;
        first = second.substring(0, second.length()- first.length());
        second = second.replace(first,"");
        System.out.println("{\n\"first\" : \"" + first +"\",\n" + "\"second\" : \"" + second + "\"\n}");
    }
}
