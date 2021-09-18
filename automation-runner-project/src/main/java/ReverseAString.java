import org.omg.Messaging.SyncScopeHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseAString {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        System.out.println("Using String Builder");

        StringBuilder temp = new StringBuilder(input);
        temp.reverse();

        System.out.println(temp+"\n");

        System.out.println("Using String Buffer");

        StringBuffer temp1 = new StringBuffer(input);
        temp1.reverse();

        System.out.println(temp+"\n");

        System.out.println("From long method");

        for(int i=input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
        char[] temp2 = input.toCharArray();

        System.out.println("\n\nBy Using Char Array");
        for(int i=0, j=temp2.length-1; i<j;i++,j--){
            char tempChar = temp2[i];
            temp2[i] = temp2[j];
            temp2[j] = tempChar;
        }
        System.out.println(new String(temp2));

        System.out.println("\n\nBy Using Stack");
        Stack<Character> st = new Stack();
        for(int i=0; i<input.length() ;i++){
            st.push(input.charAt(i));
        }
        String Output="";
        int len = input.length();
        for(int i=0; i<len ;i++){
            if(i==0)
                Output = st.pop().toString();
            else
                Output = Output + st.pop().toString();

        }
        System.out.println(Output);

        Output ="";

        System.out.println("\n\nWithout Using length function");

        int i=0;
        try{
            while(true) {
                Output = input.charAt(i) + Output;
                i++;
            }
        }
        catch(Exception e){
            System.out.println(Output);
        }




    }
}
