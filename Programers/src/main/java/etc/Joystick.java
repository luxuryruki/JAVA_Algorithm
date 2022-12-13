package etc;

public class Joystick {
    public static void main(String[] args) {
        String name = "BBAA";
        int answer = 0;

        //위치 카운트
        int cnt = 0;

        int len = name.length();
        int current = 0;
        int min = len-1;

        for(int i =0;i < len ; i++){
            if(name.charAt(i) != 'A') {
                cnt = i;
                min = Math.min(min,(len - cnt) + current * 2);
                min = Math.min(min,(len - cnt) * 2 + current);
                current = i;
            }
        }


        System.out.println(answer);



        //알파벳 카운트
        for(int i = 0; i < len;i++){
            char a = 'A';
            cnt = 0;
            while(name.charAt(i) != a){
                cnt++;
                a = (char) (65 + cnt);

            }
            if(cnt > 13){
                answer += 26 - cnt;
            }else{
                answer += cnt;
            }

        }
        System.out.println(answer);

    }
}
