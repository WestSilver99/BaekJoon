package BaekJoon.BakingDog;

import java.util.Scanner;

public class BaekJoon_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = (x*y*z);

        String str = Integer.toString(sum);
        //int cnt = 0;
        for(int i = 0; i<10; i++){
            int cnt = 0;
            for(int j = 0; j<str.length(); j++){
                if((str.charAt(j)-'0')==i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
