package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long [] s = new long[n];
        long [] c = new long[n];

        int cnt =0;

        s[0] = sc.nextInt();

        for(int i=1; i<n; i++){
            s[i] = s[i-1] + sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            int remainder = (int) (s[i]%m);
            c[i] = remainder;
            System.out.println(c[i]);
        }
        //System.out.println(cnt);
    }
}
