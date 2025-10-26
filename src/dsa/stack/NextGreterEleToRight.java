package dsa.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreterEleToRight {
    //1.    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] nums=new int[n];
//        for(int i=0;i<n;i++){
//            nums[i]=sc.nextInt();
//        }
//        System.out.println(Arrays.toString(nums));
//        Stack<Integer> st = new Stack<>();
//        for(int i=0;i<n;i++){
//            int netr=nums[i];
//            boolean f= false;
//            for(int j=i;j<n;j++){
//                if(netr<nums[j]){
//                    nums[i]=nums[j];
//                    f=true;
//                    break;
//                }
//            }
//            if(!f){
//                nums[i]=-1;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//    }


// 2.   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        int[] ans=new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//        Stack<Integer> st = new Stack<>();
//        st.push(-1);
//        for (int i = n - 1; i >= 0; i--) {
//            boolean f=false;
//            while (!st.isEmpty()){
//                if (st.peek() > nums[i]) {
//                    ans[i] = st.peek();
//                    st.push(nums[i]);
//                    f=true;
//                    System.out.println("st2=>" + st);
//                    break;
//                } else {
//                    st.pop();
//                }
//            }
//           if(!f){
//               ans[i]=-1;
//               st.push(nums[i]);
//           }
//        }
//
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.toString(ans));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] anss = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        st.push(nums[n-1]);
        anss[n-1]=-1;
        for (int i = n - 2; i >= 0; i--) {
         while (!st.isEmpty() && st.peek()<=nums[i]){
             st.pop();
         }
         if(st.isEmpty()){
             anss[i]=-1;
         }else{
             anss[i]=st.peek();
         }
         st.push(nums[i]);
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(anss));
    }
}
