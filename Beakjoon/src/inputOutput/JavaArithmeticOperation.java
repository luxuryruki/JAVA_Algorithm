package inputOutput;

import java.io.*;
import java.util.StringTokenizer;

//3003번 킹, 퀸, 룩, 비숍, 나이트, 폰
public class JavaArithmeticOperation {
    public static void main(String[] args) throws IOException {
//king queen bishop knight rook pawn'
        int[] defaultArray = new int[]{1,1,2,2,2,8};
        int[] inputArray = new int[6];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        inputArray[0] = Integer.parseInt(st.nextToken());
        inputArray[1] = Integer.parseInt(st.nextToken());
        inputArray[2] = Integer.parseInt(st.nextToken());
        inputArray[3] = Integer.parseInt(st.nextToken());
        inputArray[4] = Integer.parseInt(st.nextToken());
        inputArray[5] = Integer.parseInt(st.nextToken());
        for(int i = 0; i < 6;i++){
            int differences = defaultArray[i] - inputArray[i];
            if(i < 5){
                sb.append(differences).append(" ");
            }else{
                sb.append(differences);
            }
        }

        System.out.println(sb);
    }
}
