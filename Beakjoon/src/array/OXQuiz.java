package array;

import java.util.Scanner;

public class OXQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNum = sc.nextInt();



        for(int i = 1; i <= testNum;i++){
            String str = sc.next();
            int score = 0;
            int result = 0;
            for(int j = 0; j < str.length();j++){
                if(str.charAt(j) == 'O'){
                    score += 1;
                    result += score;
                }else{
                    score = 0;
                }
            }
            System.out.println(result);
        }

    }


}
