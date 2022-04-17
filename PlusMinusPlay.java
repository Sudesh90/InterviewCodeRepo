package InterviewCodeRepo;
/*
Write a function solution that, given a string of length N, replaces all 'plus' with + and
'minus' with -. Example - input -> plusminusplus o/p -> +-+
 */
class PlusMinusPlay {
    public static void main(String[] args) {
        String s = solution("plusminusplusplusminus");
        System.out.println(s);

    }

//    private static String solution(String S) {
    //String str = S;
    //str = str.replace("plus","+");
    //str = str.replace("minus","-");
//}
        private static String solution(String str) {
            str = str.replace("plus","+");
            str = str.replace("minus","-");
        return str;
    }
}