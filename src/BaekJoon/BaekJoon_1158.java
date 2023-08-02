package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue <Integer> queue = new LinkedList<>();

        int n= sc.nextInt();

        for(int i =1; i<=n; i++){
            queue.add(i);
        }
        int k = sc.nextInt();

        System.out.print("<");

        for(int i = 0; i<n; i++){
            for(int j=0; j<k-1; j++){
                queue.add(queue.poll());
            }
            if (i < n - 1) {
                System.out.print(queue.poll() + ", "); // 마지막 루프가 아닐 때 쉼표 출력
            } else {
                System.out.print(queue.poll()); // 마지막 루프일 때 쉼표 없이 출력
            }
        }
        System.out.print(">");
    }
}
