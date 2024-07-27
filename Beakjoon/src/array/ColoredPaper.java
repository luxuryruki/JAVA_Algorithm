package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2563 색종이
public class ColoredPaper {
    public static void main(String[] args) throws IOException {
        int[][] white = new int[100][100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;
        int cnt =0;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for(int j = x ; j < x+10;j++){
                for(int h = y ; h < y+10 ; h++){

                    white[j][h] = 1;
                }
            }
        }
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(white[i][j] == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
