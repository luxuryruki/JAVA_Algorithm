package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2738 행렬 덧셈
public class MatrixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arrayA = new int[N][M];
        int[][] arrayB = new int[N][M];
        int[][] arrayResult = new int[N][M];
        for(int i =0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M ; j++){
                arrayA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i =0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M ; j++){
                arrayB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < N ; i++){
            for(int j = 0; j < M ; j++){
                arrayResult[i][j] = arrayA[i][j] + arrayB[i][j];
                if(i == N-1 && j == M-1) {
                    sb.append(arrayResult[i][j]);
                }else if(j == N-1){
                    sb.append(arrayResult[i][j]).append('\n');
                }else{
                    sb.append(arrayResult[i][j]).append(" ");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
