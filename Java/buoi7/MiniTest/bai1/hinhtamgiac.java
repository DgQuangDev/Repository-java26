package bai1;

import java.util.Scanner;

public class hinhtamgiac {
    public void tamgiac1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so do cua hinh tam giac: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void tamgiac2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so do cua hinh tam giac: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= n ; j++ ){
                if(j <= n-i){
                    System.out.print(" ");
                }
                else System.err.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hinhtamgiac htg = new hinhtamgiac();
        htg.tamgiac1();
        htg.tamgiac2();
    }
    
}
