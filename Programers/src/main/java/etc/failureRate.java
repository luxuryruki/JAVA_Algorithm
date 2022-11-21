package etc;

public class failureRate {
    public static void main(String[] args) {
        int[] stages = new int[]{4,4,4,4,4};
        int N = 4;
        int[] answer = new int[]{};
        System.out.println(answer);;

        /*
        1. 실패율 넣을 배열 생성 / 유저 숫자 넣을 변수생성
        2. 스테이지 오름차순 정렬
        3. for문으로 1stage부터 실패한 사람 수 / (stage 길이 - 이전 실패한 사람 수) 로 실패율 넣기
        */

        int[] failureRate = new int[N+1];
        int userNum = stages.length;
    }
}
