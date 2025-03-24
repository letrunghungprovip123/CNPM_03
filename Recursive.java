public class Recursive {

    // ex01

    public static int iterFactorial(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }

    public void printArr(int[] arr, int n) {
        if (n >= arr.length) {
            return;
        }
        printArr(arr, n - 1);
        System.out.println(arr[n - 1]);
    }

    public static int recursiveFactorial(int n) {
        return n == 1 ? 1 : n * iterFactorial(n - 1);
    }

    public static int iterB(int x, int n) {
        int b = x;
        for (int i = 1; i < n; i++) {
            System.out.println(i + "h");
            x *= b;
        }
        return x;
    }

    public static int recurB(int x, int n) {
        return n == 1 ? x : x * recurB(x, n - 1);
    }

    public static int iterC(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n = n / 10;
        }
        return cnt;
    }

    public static int recurC(int n, int cnt) {
        return n == 0 ? cnt : recurC(n / 10, cnt + 1);
    }

    public static boolean checkPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int iterGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int recurGCD(int a, int b) {
        return b == 0 ? a : recurGCD(b, a % b);
    }

    // ex03
    public static boolean recurCheckPrime(int n, int d) {
        if (d * d > n || n == 2)
            return true;
        if (n < 2)
            return false;
        if (n % d == 0)
            return false;
        return recurCheckPrime(n, d + 1);
    }

    // ex04
    public static int recurA4(int n) {
        if (n == 1)
            return 3;
        return (2 * n + 1) + recurA4(n - 1);
    }

    public static int recurB4(int i, int n) {
        if (i > n)
            return 0;
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial + recurB4(i + 1, n);
    }

    public static int recurC4(int i, int n) {
        if (i > n)
            return 0;
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial * recurC4(i + 1, n);
    }

    public static int recurD4(int n, int r) {
        if (n < r || r < 0) {
            return 1;
        }
        return n * recurD4(n - 1, r + 1);
    }

    public static int coutDigit(int i, int count) {
        if (i == 0)
            return count;
        return coutDigit(i / 10, count + 1);
    }

    public static void main(String[] args) {
        // System.out.println(iterFactorial(5));
        // System.out.println(recursiveFactorial(5));
        // System.out.println(iterFactorial(15));
        // System.out.println(recursiveFactorial(15));
        // System.out.println(iterB(5, 5));
        // System.out.println(recurB(5, 5));
        // System.out.println(iterC(20313412));
        // System.out.println(recurC(1241414132, 0));
        // System.out.println(checkPrime(97));
        // System.out.println(iterGCD(48, 16));
        // System.out.println(recurGCD(48, 16));
        // System.out.println(recurCheckPrime(38, 2));

        System.out.println(recurD4(8, 5));
        ;

    }
}
