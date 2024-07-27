package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhoNotYetSubmitted {
    public static void main(String[] args) throws IOException {
        int[] classes = new int[31];
        for(int i =1; i<31; i++){
            classes[i] = i;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<28; i++){
            int submitted = Integer.parseInt(br.readLine());
            classes[submitted] = 0;
        }
        for(int i =1; i<31; i++){
            if(classes[i] != 0){
                System.out.println(classes[i]);
            }
        }


    }
}
