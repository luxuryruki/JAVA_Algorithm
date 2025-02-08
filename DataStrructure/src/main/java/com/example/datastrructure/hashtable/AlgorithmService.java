package com.example.datastrructure.hashtable;

public class AlgorithmService {

    // 1. 중복이 없는가?
    // Check list
    // - ASCII 코드인가? 128 자 처리
    // - 확장형 ASCII 코드인가? 256 자 처리
    public boolean isDuplicated(String input) {
        boolean[] isDuplicated = new boolean[128]; // ASCII 코드는 256자
        for(char c : input.toCharArray()) {
            if(isDuplicated[c]){
                return true;
            }else {
                isDuplicated[c] = true;
            }
        }
        return false;
    }

     /* 2. 순열확인 1
     *      - 짧은 input 확인
     *
     * */
    public boolean isPermutation(String a, String b) {
        if(a.length() != b.length()) return false;
        int[] count = new int[128];
        for(char c : a.toCharArray()) {
            count[c]++;
        }
        for(char c : b.toCharArray()) {
            count[c]--;
            if(count[c] < 0) return false;
        }
        return true;
    }

    public String replaceSpaces1(String input) {
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        int length = words.length;
        for(int i = 0; i < length; i++) {
            if(i==length-1){
                sb.append(words[i]);
            } else {
                sb.append(words[i]).append("%20");
            }
        }
        return sb.toString();
    }

    public void replaceSpaces2(char[] str, int trueLength) {
        int spaceCounter = 0, index, i = 0;
        for(i = 0; i< trueLength; i++) {
           if(str[i] == ' '){
                spaceCounter++;
           }
        }
        index = trueLength - spaceCounter *2;
        if(trueLength < str.length) str[trueLength] = '\0';
        for(i = trueLength - 1; i >= 0; i--) {
            if(str[i] == ' '){
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    /*
    * 하나의 문자를 제외한 나머지 문자는 모두 짝 수
    * 홀수인 문자인 수를 카운트 -> 두개 이상이면 회문이 아니다.
    * 1. 문자 카운트 - ASCII를 활용
    * 2. 카운트 된 문자들의 2%가 1이면 홀수
    *
    * 개선점
    * 1. 대소문자 구분
    * 2. 공백제거
    * */
    public boolean isPalindreme(String input){
        input = input.toLowerCase().replace(" ","");
        int oddNum = 0;                   // 홀수 개수의 문자를 카운트할 변수
        int[] charCount = new int[128];    // 아스키 코드 기반 문자 개수 저장 배열

        // 입력 문자열의 각 문자의 개수를 세는 과정
        for(char c : input.toCharArray()){
            charCount[c] += 1; // 해당 문자의 개수 증가
        }

        // 각 문자의 개수를 순회하며 홀수 개수를 확인
        for (int i : charCount){
            if(i % 2 == 1){   // 문자의 개수가 홀수인 경우
                oddNum++;      // 홀수 개수 증가
                if (oddNum >= 2) return false; // 홀수 개수가 2 이상이면 회문의 순열이 될 수 없음
            }
        }

        return true; // 홀수 개수가 1개 이하라면 회문의 순열이 가능
    }

    /*
    * 문자 편집 경우의 수
    * 삽입 -> 문자 길이가 2이상 차이나면 안됨
    * 삭제 -> 문자 길이가 2이상 차이나면 안됨
    * 수정 -> 문자 하나하나 확인
    *
    * 대소문자 구분
    * 공백제거
    *
    * */
    public boolean isEditedOnlyOnce(String original, String edited){
        original = original.toLowerCase().replace(" ","");
        edited = edited.toLowerCase().replace(" ","");

        int originCount = original.length();
        int editedCount = edited.length();
        int editedNo = originCount - editedCount;

        if(Math.abs(editedNo) >= 2){
            return false;
        }

        //문자 수정 로직
        if(originCount == editedCount){
            return checkUpdated(original, edited);
        }

        //문자 삽입/삭제로직
        if(originCount > editedCount){
            return checkInsertedOrDeleted(original, edited);
        }else{
            return checkInsertedOrDeleted(edited,original);
        }
    }

    private boolean checkUpdated(String original, String edited){
        boolean isUpdated = false;
        for(int i = 0; i < original.length(); i++ ){
            if(original.charAt(i) != edited.charAt(i)){
                if(isUpdated){
                    return false;
                }
                isUpdated = true;
            }
        }
        return true;
    }

    private boolean checkInsertedOrDeleted(String longer, String shorter){
        boolean isInsertedOroDeleted = false;
        int indexL = 0;
        int indexS = 0;

        while (indexL < longer.length() && indexS < shorter.length()){
            if(longer.charAt(indexL) != shorter.charAt(indexS)){
                if (isInsertedOroDeleted) return false;
                isInsertedOroDeleted = true;
                indexL++;
            }else {
                indexS++;
                indexL++;
            }
        }
        return true;
    }

    public String compressString(String input){
        input = input.replace(" ","");
        String compressedString = "";
        int compressedNo = 1;
        for(int i = 0; i < input.length()-1; i++){
            if(compressedNo == 1){
                compressedString += input.charAt(i);
            }
            if(input.charAt(i) == input.charAt(i+1)){
                compressedNo++;
            }else{
                compressedString += compressedNo;
                compressedNo = 1;
            }

            if(i == input.length()-2) compressedString += compressedNo;
        }
        return input.length() >= compressedString.length() ? compressedString : input;
    }


    // 난이도 별 5개
    public String rotate(int[][] matrix){
        if(matrix.length == 0 || matrix[0].length != matrix.length) return "회전할 수 없는 매트릭스";
        int temp = 0;
        for(int s = 0, e = matrix.length - 1; s < e; s++, e--){
            for(int i = s, j = e; i<j; i++,j--){
                temp = matrix[s][i];
                System.out.println(temp);
                matrix[s][i] = matrix[s][j];
                matrix[s][j] = matrix[e][j];
                matrix[e][j] = matrix[e][i];
                matrix[e][i] = temp;
            }
        }
        return matrixToString(matrix);
    }

    private String matrixToString(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            sb.append("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                sb.append(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]\n"); // 행 개행
        }
        return sb.toString();
    }

    public String setZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlags = new boolean[rows];
        boolean[] colFlags = new boolean[cols];

        // 1. 0이 있는 위치를 기록
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags[i] = true;  // 해당 행을 0으로 설정
                    colFlags[j] = true;  // 해당 열을 0으로 설정
                }
            }
        }

        // 2. 기록된 행을 0으로 설정
        for (int i = 0; i < rows; i++) {
            if (rowFlags[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 3. 기록된 열을 0으로 설정
        for (int j = 0; j < cols; j++) {
            if (colFlags[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrixToString(matrix);
    }

}