package com.example.datastrructure.hashtable;

public class AlgorithmTest {
    public static void main(String[] args) {
        AlgorithmService algorithmService = new AlgorithmService();
        //1
//        System.out.println(algorithmService.isDuplicated ("abc"));
//        System.out.println(algorithmService.isDuplicated ("abca"));
//        System.out.println(algorithmService.isDuplicated ("abcdefghijklmnopqrst"));

        //2
//        System.out.println(algorithmService.isPermutation ("abc","cab"));
//        System.out.println(algorithmService.isPermutation ("listen","silent"));
//        System.out.println(algorithmService.isPermutation ("hello","oollh"));
//        System.out.println(algorithmService.isPermutation("abcdefghij", "jihgfedcba")); // true, 동일한 문자로 구성, 순서만 다름
//        System.out.println(algorithmService.isPermutation("aabbccddeeff", "ffeeddccbbaa")); // true, 동일 문자 구성, 순서만 다름
//        System.out.println(algorithmService.isPermutation("abcdefghij", "abcdefghik")); // false, 다른 문자 포함
//        System.out.println(algorithmService.isPermutation("hellohello", "oellhhello")); // true, 같은 문자 반복 포함
//        System.out.println(algorithmService.isPermutation("abcdefghij", "abcdefghijl")); // false, 길이 다름

        //3
//        System.out.println(algorithmService.replaceSpaces1("Mr John Smith"));
//        System.out.println(algorithmService.replaceSpaces1("Mr Jo hn S m i t h"));


        System.out.println(algorithmService.isEditedOnlyOnce("pale", "pae"));   // Expected: true  | Actual: false  (1번 삭제)
        System.out.println(algorithmService.isEditedOnlyOnce("pale", "pake"));  // Expected: true  | Actual: false  (1번 수정)
        System.out.println(algorithmService.isEditedOnlyOnce("pale", "paless")); // Expected: false | Actual: true  (2번 삽입)
        System.out.println(algorithmService.isEditedOnlyOnce("pale", "bales")); // Expected: false | Actual: true  (1번 수정 + 1번 삽입)
        System.out.println(algorithmService.isEditedOnlyOnce("pale", "paleee"));// Expected: false | Actual: true  (2번 삽입)
        System.out.println(algorithmService.isEditedOnlyOnce("pale", "plae"));  // Expected: false | Actual: true  (글자 위치 변경)

    }
}
