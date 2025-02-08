public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        //check number of char
        if(s.length() != t.length()) return false;

        // ASCII
        int[] index = new int[128]; // constant 상수크기의 배열을 사용하기 때문에 공간복잡도는 O(1)

        for(char c : s.toCharArray()){  //O(N) 문자열을 순차적으로 순회
            index[c]++;
        }

        for(char c : t.toCharArray()){
            index[c]--;
            if(index[c] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("anagram", "nagaram"));
    }
}
