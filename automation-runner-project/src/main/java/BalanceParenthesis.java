import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String []args){
        String pString = "[()]{}{[()()]()}{[]}{}";
        if(checkBracketsBalanced(pString)){
            System.out.print("Balanced");
        }
        else{
            System.out.print("Not Balanced");
        }
    }

    private static boolean checkBracketsBalanced(String pString) {
        char check;
        Stack<Character> s = new Stack();

        for(int i = 0; i< pString.length(); i++){
            if(pString.charAt(i)=='[' || pString.charAt(i)=='{' || pString.charAt(i)=='('){
                s.push(pString.charAt(i));
            }
            else{
                if (s.isEmpty())
                    return false;
                switch (pString.charAt(i)) {
                    case ')':
                        check = s.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = s.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = s.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }

            }

        }
        return s.isEmpty();

    }
}
