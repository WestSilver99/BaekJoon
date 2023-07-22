package BaekJoon;

import java.util.Scanner;

public class BaekJoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 과목의 개수 n
        if(n>1000 || n<0)
            return;
        //0<n<=1000

        int[] scores = new int[n];
        // 점수 n개

        for(int i=0; i<scores.length; i++){
            int score = sc.nextInt();
            scores[i] = score;
        }

        int max = -1;
        int sum = 0;

        for(int i=0; i<n; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            //최대값 구하기
            sum += scores[i];
            //총합 구하기

        }
        System.out.println(sum*100.0/n/max);
        //System.out.println(sum/max*100.0/n); 잘못된 수식

    }
}
