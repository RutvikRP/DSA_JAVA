package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBreacket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        boolean ans = checkBalanceBracket2(inputStr);
        System.out.println(ans);
    }

    private static boolean checkBalanceBracket2(String inputStr) {
        Stack<Character> characterStack=new Stack<>();
        for(int i=0;i<inputStr.length();i++){
            if(inputStr.charAt(i)=='(' || inputStr.charAt(i)=='{'|| inputStr.charAt(i)=='['){
                characterStack.push(inputStr.charAt(i));
            }else{
                if(characterStack.isEmpty()){
                    return false;
                }
                char top = characterStack.pop();
                if(inputStr.charAt(i)=='}' && top!='{'){
                    return false;
                }else  if(inputStr.charAt(i)==')' && top!='('){
                    return false;
                }else  if(inputStr.charAt(i)==']' && top!='['){
                    return false;
                }
            }
        }
        return characterStack.isEmpty();
    }
}
