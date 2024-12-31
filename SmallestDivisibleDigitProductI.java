// You are given two integers n and t. Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.
// input = 10,t = 2 output = 10
// input = 15,t = 3 output = 16
public class SmallestDivisibleDigitProductI {
    public static void main(String[] args) {

        int n = 10, t = 2;
        System.out.println(smallestNumber(n, t));

    }

    public static int smallestNumber(int n, int t) {
        int num = n;
        int res = 1;
        res = multiply(n);
        if (res % t == 0) {
            return num;
        }
        while (res % t != 0) {
            num++;
            res = multiply(num);
        }
        return num;
    }

    // multiplying digits of the number
    public static int multiply(int n) {
        int res = 1;
        while (n > 0) {
            res *= n % 10;
            n /= 10;
        }
        return res;
    }
}
