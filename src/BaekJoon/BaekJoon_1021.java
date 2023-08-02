package BaekJoon;

import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        LinkedList<Integer> deque = new LinkedList<>();

        int count = 0;

        for(int i = 1; i<=N; i++)
        {
            deque.add(i);
        }
        for(int i = 0; i<M; i++){
            int num = sc.nextInt();
            while(true){
                if(deque.getFirst()==num){
                    deque.pollFirst();
                    break;
                }
                if(deque.indexOf(num) <= deque.size()/2){
                    deque.addLast(deque.pollFirst());
                }
                else{
                    deque.addFirst((deque.pollLast()));
                }
                count++;
            }
        }
        System.out.println(count);
    }
}
