package forWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//25304 영수증
public class Receipt {

//    첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//
//    둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//
//    이후 $N$개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = 0;
        int N = 0;
        int a = 0;
        int b = 0;
        int total =0;

        for(int i =0; i <3;i++){
            switch (i){
                case 0 : X = Integer.parseInt(br.readLine()); break;
                case 1 : N = Integer.parseInt(br.readLine()); break;
                case 2 :
                    for(int j=0;j<N;j++){
                        StringTokenizer st = new StringTokenizer(br.readLine());
                        a = Integer.parseInt(st.nextToken());
                        b = Integer.parseInt(st.nextToken());
                        total += a * b;
                    }; break;
            }
        }
        if(X == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
