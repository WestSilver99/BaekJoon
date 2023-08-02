package BaekJoon.BakingDog;

import java.util.Scanner;

public class BaekJoon_1475 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[10];

        for(int i = 0; i<str.length(); i++){
            int num = Character.getNumericValue(str.charAt(i));
            if(num==6){
                arr[9]++;
            }
            else{
                arr[i]++;
            }
        }

    }
}
