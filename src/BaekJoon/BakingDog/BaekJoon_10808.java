package BaekJoon.BakingDog;

import java.util.Scanner;

public class BaekJoon_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int [] cnt = new int[26];
        for(int i = 0; i<str.length(); i++){
            int x = str.charAt(i) - 97;
            cnt[x]++;
        }
        for(int i = 0; i< cnt.length; i++){
            System.out.print(cnt[i] + " ");
        }
    }

}
