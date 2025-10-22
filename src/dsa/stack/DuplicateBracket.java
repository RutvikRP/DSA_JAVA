package dsa.stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        boolean ans=checkDuplicateBracket(input);
        System.out.println(ans);
    }

    private static boolean checkDuplicateBracket(String input) {
        Stack<Character> characterStack=new Stack<>();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(c==')'){
               if(characterStack.peek()=='('){
                   return true;
               }else{
                   while (characterStack.peek()!='('){
                       characterStack.pop();

                   }
                   characterStack.pop();
               }
            }else{
                characterStack.push(c);
            }
        }
        return false;
    }
}
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class DuplicateBracket {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input=sc.nextLine();
//        boolean ans=checkDuplicateBracket(input);
//        System.out.println(ans);
//    }
//
//    private static boolean checkDuplicateBracket(String input){
//        Stack<Character> characterStack=new Stack<>();
//        for(int i=0;i<input.length();i++){
//            int countOfBetweenChar=0;
//            char c=input.charAt(i);
//            if(c==')'){
//                char o='a';
//                while(o!='('){
//                    o=characterStack.peek();
//                    characterStack.pop();
//                    countOfBetweenChar++;
//                }
//                if(countOfBetweenChar==1){
//                    return true;
//                }
//            }else{
//                characterStack.push(c);
//            }
//        }
//        return false;
//    }
//}
