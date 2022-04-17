package InterviewCodeRepo;

/*
There are two wooden sticks of length A and B respectively. Each of them can be cut into shorter sticks of integer.
Our goal is to construct the largest possible square. In order to do this, we would want to cut this stick in such
a way that to achieve four sticks of the same length (note that there can be leftover). What is the longest side of
square that we can achieve?

Constraints - A & B [1, 100..]
i/p -> A = 10, B = 21 -> o/p -> 7 as we can shorten A to 7.
i/p -> A = 13, B = 11 -> o/p -> 5 as we can cut them into of length 5, leftover is applicable.
i/p -> A = 1, B = 8 -> o/p -> 2 as we can cut sticks into 4 parts.
 */
class WoodenStickPlay {

    public static void main(String[] args) {
//        int result = solution(1,8);//2 -> passed
//        int result = solution(13,11);//5 -> passed
        int result = solution(10,21);//7 -> passed
        System.out.println("Expected result "+result);
    }
    private static int solution(int A, int B){
        int max = 0;
        if(A == 1) return B/4;
        if(B == 1) return A/4;
        if(A+B < 4) return (A+B)/4;
        else{
            max = (A + B) / 4;
            while(max > 0) {
                if (A / max + B / max == 4) {
                    return max;
                }
                max--;
            }
        }
        return max;
    }
}