package bai4;

import java.util.Scanner;

public class PrimeNumber {
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

    public void checkSNT(){
        Scanner sc = new Scanner(System.in);
        int i = 2;
        int n = 0;
        while ( n < 10 ){
            if(isPrimeNumber(i)){
                System.out.print(" "+i+" ");
                n++;
            }
            i++;
        }
        System.out.println("");
        for ( i = 2 ; i < 10 ; i++){
            if(isPrimeNumber(i)){
                System.out.print(" "+i+" ");
            }
        }
        
    }

    public static void main(String[] args) {
        PrimeNumber snt = new PrimeNumber();
        snt.checkSNT();
    }




}