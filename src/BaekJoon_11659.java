import java.util.Scanner;

public class BaekJoon_11659 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //수의 개수 N (배열의 길이)
        int M = sc.nextInt(); //구해야 하는 문제의 개수 M

        int [] arr = new int[N+1]; // N의 길이를 가진 합배열 arr 선언

        arr[0] = 0;

        for(int i=0; i<N; i++){
            arr[i+1] = arr[i] + sc.nextInt();
        } // 배열 arr의 원소를 입력

        for(int i=0; i<M; i++){
            int a = sc.nextInt(); // 구간 a
            int b = sc.nextInt(); // 구간 b
            System.out.println(arr[b]-arr[a-1]);
        } // M번 동안 b에서 a구간까지의 부분합 출력
        System.out.println(arr[0]); // arr[0]은 기본값인 0이다.
    }
}


