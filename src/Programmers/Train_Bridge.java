package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Train_Bridge {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] truck_list = {7,4,5,6};
        System.out.println(solution.solution(2,10,truck_list));
    }
}
class Solution{
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer>queue = new LinkedList<>();
        int time = 0;
        int sum = 0;
        for(int i = 0; i<truck_weights.length; i++){
            int truck = truck_weights[i];
            while (true){
                if(queue.isEmpty()){
                    queue.add(truck);
                    sum+=truck;
                    time++;
                    break;
                } else if (queue.size()==bridge_length) {
                    sum-=queue.poll();
                }else{
                    if(sum+truck<=weight){  //여기부터
                        queue.add(truck);
                        sum+=truck;
                        time++;
                        break;
                    }else{
                        queue.add(0);
                        time++;
                    }                                   //여기까지
                }
            }
        }
        return time + bridge_length;  //  왜 bridge_length를 더하는지
    }
}
