package InterviewCodeRepo;

/*
Write a function solution that, given an integer N, returns the smallest integer greater than N,
the sum of whose digits are twice as big as the sum of digit of N.
Constraints - N [1,500]
test case 1 -
input - 121, sum of digits of 121 -> 4
constraint - 242 -> sum of digits -> 8

test case 2 -
input - 14, sum of digits of 14 -> 5
constraint or o/p - 19 -> sum of digits -> 10
 */
class SumOfDigitsPlay {

    public static void main(String[] args) {

        int result = solution(99);

        System.out.println("Expected result : "+result);
    }

    private static int solution(int num){
        int sumOfDigits = sumOfDigits(num);
        int temp = num + 1, result = 0, twiceSumOfDigits = 0;

        while (true){
            twiceSumOfDigits = sumOfDigits(temp);
            if(2*sumOfDigits == twiceSumOfDigits){
                result = temp;
                break;
            }
            temp++;
        }
        return result;
    }

    private static int sumOfDigits(int n){
        int sum = 0;
        for(int a = n; a > 0; a = a/10){
            sum += a % 10;
        }
        return sum;
    }

}