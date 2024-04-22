package bai1;

import java.util.Scanner;

public class hinhvuong{
    public void hv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai canh cua hinh vuong: ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hinhvuong h = new hinhvuong();
        h.hv();
    }
}

