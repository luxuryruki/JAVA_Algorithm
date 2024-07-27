package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[][] array = new int[9][9];
        int max = 0;
        int x = 0;
        int y = 0;

        for (int i = 1; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 10; j++) {
                array[i - 1][j - 1] = Integer.parseInt(st.nextToken());
                if (array[i - 1][j - 1] >= max) {
                    max = array[i - 1][j - 1];
                    x = i;
                    y = j;
                }
            }
        }
        sb.append(max).append('\n');
        sb.append(x).append(" ");
        sb.append(y);
        System.out.println(sb);
    }
}
