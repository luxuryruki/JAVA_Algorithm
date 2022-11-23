package etc;

public class failureRate {
    public static void main(String[] args) {
        int[] stages = new int[]{4,4,4,4,4};
        int N = 4;
        int[] answer = {};
        answer = new int[N];

        double[] failureRate = new double[N+2];
        int[] failureNum = new int[N+2];
        int userNum = stages.length;
        for(int i : stages){
            failureNum[i] += 1 ;
        }
        for(int j = 1; j <= N+1; j++){
            failureRate[j] = (double) failureNum[j]/userNum;
            userNum -= failureNum[j];
        }

        double max;
        for(int j = 1 ; j < N+1 ; j++){
            max = -0.1;
            for(int i = 1; i < N+1 ; i++){
                if(failureRate[i] > max){
                    max = failureRate[i];
                    answer[j-1] = i;
                }
            }
            failureRate[answer[j-1]] = -1;
        }
        for(int i : answer){
            System.out.println(i);
        }



    }
}
