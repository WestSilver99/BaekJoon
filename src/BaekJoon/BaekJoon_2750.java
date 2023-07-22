package BaekJoon;

import java.util.Scanner;

public class BaekJoon_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String chr = sc.next();

        char[] StringNumber = chr.toCharArray();

        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=Character.getNumericValue(StringNumber[i]);
        }
        System.out.println(sum);
    }

}
