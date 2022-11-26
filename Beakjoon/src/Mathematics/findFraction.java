package Mathematics;

// 1193 분수찾기
public class findFraction {
    static  int x = 1;
    public static void main(String[] args) {
        // 가로(i)와 세로 (j)가 있다고 가정
        // j가 1일때 그다음 숫자는 i +1
        findFraction fr = new findFraction();
        int n = 3;

        int i = 1; //앞
        int j = 1; //뒤

        while(n > x){
            if (i == 1) {
                x++;
                j++;
                System.out.println("i : " + i);
                System.out.println("j : " + j);
                fr.A(i,j,x,n);
            }else if(j == 1){
                x++;
                i++;
                System.out.println("i : " + i);
                System.out.println("j : " + j);
                fr.B(i,j,x,n);
            }
        }
        System.out.println("final i : " + i);
        System.out.println("final j : " + j);
        System.out.println(("final x : "+ x));
    }

    public void A (int i, int j,  int x, int n){
        while(j > 1 && x !=n){
            x++;
            i++;
            j--;

        }

        System.out.println("i : " + i);
        System.out.println("j : " + j);
    }

    public void B(int i, int j, int x, int n){
        while(i > 1 || n > x){
            i--;
            j++;
        }

        System.out.println("i : " + i);
        System.out.println("j : " + j);
    }
}

