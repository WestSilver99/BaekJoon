package BaekJoon.BakingDog;

import java.util.Scanner;

public class BaekJoon_9093_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];

        for(int i = 0; i<n; i++){
            String word = sc.nextLine();
            String[] arr = word.split(" ");
            StringBuilder sb = new StringBuilder();
            for(String words : arr){
                for(int j = words.length()-1; j>=0; j--){
                    sb.append(words.charAt(j));
                }
                sb.append(" ");
            }
            str[i] = sb.toString();
        }
        for(String words : str){
            System.out.println(words);
        }
    }
}
