package InterviewCodeRepo;

import java.util.HashMap;
import java.util.Map;

/*
Find repeating letter, All letters are in a string are distinct except for one, Determine which one.
 */
class RepeatingLetterPlay {

    public static void main(String[] args) {

//        String str = solution("gegks");
        String str = solution("aba");
        System.out.println("letter occurs more than once : "+str);
    }
    private static String solution(String S){
//        char[] chAr = S.toCharArray();
//        Arrays.sort(chAr);
//        String result = "";
//        for(int i = 0; i < chAr.length - 1; i++){
//            if(chAr[i] == chAr[i+1]){
//                result += chAr[i];
//                break;
//            }
//        }
//        return result;
        //2nd way - count each letter and return those whose length is > 1
        char[] chArr = S.toCharArray();
        String result = "";
        Map<Character, Integer> map = new  HashMap<>();
        for(char ch : chArr){
            if(map.containsKey(ch)) map.put(ch,map.get(ch) +1);
            else map.put(ch, 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) result += entry.getKey();
        }
        return result;
    }

}