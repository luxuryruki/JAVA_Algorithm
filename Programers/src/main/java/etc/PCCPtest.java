package etc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;



public class PCCPtest {
    public static void main(String[] args) {
        int[][] program = new int[][]{{2, 2, 2}, {3, 0, 5}, {2, 6, 3}, {3, 11, 2}};
        //program[0] = 우선순위
        //program[1] = 호출시
        //program[2] = 실행시간

        int[] answer = new int[11];


        PriorityQueue<int[]> mainQue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return Integer.compare(o1[1],o2[1]);
                }
                return Integer.compare(o1[0],o2[0]);
            }
        });
        for(int[] p : program){
            mainQue.offer(p);
            answer[0] += p[2];
        }
        while(!mainQue.isEmpty()){
            System.out.println(Arrays.toString(mainQue.poll()));
        }
        System.out.println(answer[0]);




//        풀이 1 시간초과
//        //우선순위 큐에 배열 넣기
//        PriorityQueue<int[]> mainQue = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]){
//                    return Integer.compare(o1[1],o2[1]);
//                }
//                return Integer.compare(o1[0],o2[0]);
//            }
//        });
//        for(int[] p : program){
//            mainQue.offer(p);
//        }
//
//        //배열 임시로 넣을 큐
//        PriorityQueue<int[]> subQue = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if(o1[0] == o2[0]){
//                    return Integer.compare(o1[1],o2[1]);
//                }
//                return Integer.compare(o1[0],o2[0]);
//            }
//        });
//
//        int totalTime = 0;
//        int min = 1000;
//        while (!mainQue.isEmpty()){
//            int[] a = mainQue.peek();
//            int index = a[0];
//            int start = a[1];
//            int time = a[2];
//
//            if(start <= totalTime){
//                answer[index] += totalTime - start;
//                totalTime += time;
//                answer[0] = totalTime;
//                mainQue.poll();
//                mainQue.addAll(subQue);
//                subQue.clear();
//                min = 1000;
//
//            }else{
//                min = Math.min(min,start);
//                subQue.offer(mainQue.poll());
//            }
//
//            if(mainQue.isEmpty() && !subQue.isEmpty()){
//                totalTime = min;
//                mainQue.addAll(subQue);
//                subQue.clear();
//            }
//
//        }
//        //토탈시간 ++;
//        //대기시간 토탈시간 - 호출시간
//
//        //이슈 시간이 같지않을때 계속해서 반복문 돌리는 오류 -> min을 이용해서 반복을 최소화할 수 있음
//
//
//        System.out.println(Arrays.toString(answer));
    }
}
