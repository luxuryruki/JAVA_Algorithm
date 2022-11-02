package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); //고정비
        int B = Integer.parseInt(st.nextToken()); //변동비
        int C = Integer.parseInt(st.nextToken()); //가격
        int cost = A;
        int bep = 0;
        int sales = 0;
        if(B >= C){
            System.out.println(-1);
        }else{
            while(A >= 0){
                A = A - (C-B);
                sales++;
            }
            System.out.println(sales);
        }


    }
}
