package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10828 {
    static int counter = 0;
    static int[]stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        stack = new int[n];
        for(int i = 0 ; i<n; i++){
            String str = sc.next();

            switch (str){
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "top":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(pop()).append("\n");
                    break;
                case "empty":
                    sb.append(pop()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int item){
        stack[counter] = item;
        counter++;
    }
    public static int pop(){
        if(counter==0){
            return -1;
        }
        else{
            int popNumber = stack[--counter];
            stack[counter] = 0;
            //counter--;
            return popNumber;
        }
    }
    public static int size(){
        return counter;
    }
    public static int empty(){
        if(counter==0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int top(){
        if(counter==0){
            return -1;
        }
        else{
            return stack[counter-1];
        }
    }
}

