package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        sc.nextLine();
        String str [] = new String[n];
        ArrayList <String> stack = new ArrayList<>();

        for(int i = 0 ; i<n; i++){
            str[i] = sc.nextLine();
            for(int j = i; j<str[i].length(); j++){
                char key = str[j].charAt(j);
                if(key == ' '){
                    for(int k=0; k<j-1; k++){
                        stack.add(str[j]);
                        System.out.println(stack);
                    }
                }
            }
        }

    }

}
