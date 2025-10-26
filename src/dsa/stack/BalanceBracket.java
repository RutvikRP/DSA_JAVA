package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBracket {
    public static boolean checkBalanceBracket(String inputStr) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == ')') {
                while (!characterStack.isEmpty() && characterStack.peek() != '(') {
                    characterStack.pop();
                }
                if (characterStack.isEmpty()) {
                    return false;
                }
                characterStack.pop();
            } else if (inputStr.charAt(i) == '}') {
                while (!characterStack.isEmpty() && characterStack.peek() != '{') {
                    characterStack.pop();
                }
                if (characterStack.isEmpty()) {
                    return false;
                }
                characterStack.pop();
            } else if (inputStr.charAt(i) == ']') {
                while (!characterStack.isEmpty() && characterStack.peek() != '[') {
                    characterStack.pop();
                }
                if (characterStack.isEmpty()) {
                    return false;
                }
                characterStack.pop();
            } else {
                characterStack.push(inputStr.charAt(i));
            }
            System.out.println(characterStack);
        }
        return characterStack.isEmpty() || (!characterStack.contains('(') && !characterStack.contains('{') && !characterStack.contains('[') && !characterStack.contains(')') && !characterStack.contains('}') && !characterStack.contains(']'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        boolean ans = checkBalanceBracket(inputStr);
        System.out.println(ans);
    }
}
