package Programmers;

import java.util.Arrays;

public class Fruit {
    public static void main(String[] args) {
        FruitSolution f = new FruitSolution();
        int [] fruits = {1,2,3,1,2,3,1};
        System.out.println(f.solution(3,4, fruits));
    }
}

class FruitSolution{
    public int solution(int k, int m, int[]score){
        int answer = 0;
        Arrays.sort(score);
        int[] myScore = new int[score.length];

        for(int i = 0; i<score.length; i++){
            myScore[i] = score[score.length-1-i];
        }
        int i = 0;
        while(true){
            if(i>=myScore.length || i + m > myScore.length){
                break;
            }
            answer += myScore[i + m-1] * m;
            i += m ;
        }
        return answer;
    }
}
