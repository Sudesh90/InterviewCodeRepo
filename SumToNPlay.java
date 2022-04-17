package InterviewCodeRepo;

/*
Write a solution function that, given integer N, returns the smallest non-negative integer
whose individual digit sum to N.
Constraints - N [0, 50]
i/p -> 16, o/p -> 79 (7 + 9 = 16)
i/p -> 19, o/p -> 199 (1 + 9 + 9 = 19)
 */
class SumToNPlay {

    public static void main(String[] args) {
//        int result = solution(16);//19
//        int result = solution(19);//199
        int result = solution(7);
        System.out.println("Expected result "+result);
    }
    private static int solution(int N){
        int temp = N, result = 0;
        while(true){
            if(N == sumOfDigits(temp) ){
                result = temp;
                break;
            }
            temp++;
        }//while
        return result;
    }

    private static int sumOfDigits(int n){
        int sum = 0;
        for(int a = n; a > 0; a /= 10){
            sum += (a %10);
        }
        return sum;
    }
}