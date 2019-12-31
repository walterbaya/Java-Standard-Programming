package primes;

import java.util.Scanner;
//este algoritmo es iterativo y mucho mas eficiente en terminos de memoria
class Primes {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        int N = esc.nextInt();
        String s = primes(N);
        System.out.println(s);
    }

    static String primes(int n) {
        String s = "2 ";
        int f = n;
        int i = 2;
        while (i <= f) {
            switch (i % 10) {
                case 0:
                    i += 1;
                    break;
                case 1:
                    if (isPrime(i)) {
                        s = s + i + " ";
                    }
                    i += 2;
                    break;
                case 2:
                    i += 1;
                    break;
                case 3:
                    if(i==3){
                        s = s + 3 + " " + 5 + " "; 
                    
                    }
                    else if (isPrime(i)) {
                        s = s + i + " ";
                    }
                    i += 4;
                    break;
                case 4:
                    i += 3;
                    break;
                case 5:
                    i += 2;
                    break;
                case 6:
                    i += 1;
                    break;
                case 7:
                    if (isPrime(i)) {
                        s = s + i + " ";
                    }
                    i += 2;
                    break;
                case 8:
                    i += 1;
                    break;
                default:
                    if (isPrime(i)) {
                        s = s + i + " ";
                    }
                    i += 2;
                    break;
            }
        }
        return s;
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
