package primes;

import java.util.Scanner;
//el algoritmo causa un stackOverflow al tener n = 100000 o mas
//la idea del algoritmos es de tipo recursivo como se usaria en C++ o quizas mucho mas 
//conveniente en Haskell
class Primes {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int N = esc.nextInt();
        String s = primes(2, N, " ");
        System.out.println(s);
    }

    static String primes(int n, int f, String s) {
        int value = n % 10;
        if (n >= f) {
            return 2 + " " + s;
        } else {
            switch (value) {
                case 1:
                    if (isPrime(n)) {
                        return primes(n + 2, f, s + n + " ");

                    } else {
                        return primes(n + 2, f, s);
                    }
                case 2:
                    return primes(n + 1, f, s);
                case 3:
                    if (n == 3) {
                        return primes(n + 4, f, 3 + " " + 5 + " ");
                    } else if (isPrime(n)) {
                        return primes(n + 4, f, s + n + " ");
                    } else {
                        return primes(n + 4, f, s);
                    }
                case 4:
                    return primes(n + 7, f, s);
                case 5:
                    return primes(n + 2, f, s);
                case 6:
                    return primes(n + 3, f, s);
                case 7:
                    if (isPrime(n)) {
                        return primes(n + 2, f, s + n + " ");
                    } else {
                        return primes(n + 2, f, s);
                    }
                case 8:
                    return primes(n + 1, f, s);
                case 9:
                    if (isPrime(n)) {
                        return primes(n + 2, f, s + n + " ");
                    } else {
                        return primes(n + 2, f, s);
                    }
                default:
                    return primes(n + 1, f, s);
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
