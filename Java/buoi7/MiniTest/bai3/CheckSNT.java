package bai3;
import java.util.Random;

public class CheckSNT {

    public static boolean isPrimeNumber(int n) {
    if (n < 2) {
        return false;
    }
    int squareRoot = (int) Math.sqrt(n);
    for (int i = 2; i <= squareRoot; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
    }
    public void check(){
        Random random = new Random();
        int n = random.nextInt(1000);
        System.out.println("So ngau nhien la: " + n );
        isPrimeNumber(n);

        if( isPrimeNumber(n) == true ) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("This is not prime number");
        }
    }
    public static void main(String[] args) {
        CheckSNT check = new CheckSNT();
        check.check();
    }
}

