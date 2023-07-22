package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i<k; i++){
            int item = sc.nextInt();

            if(item==0){
                stack.pop();
            }
            else{
                stack.push(item);
            }
        }
        int sum = 0;

        for(int i : stack){
            sum+=i;
        }
        System.out.println(sum);
    }
}

