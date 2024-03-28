package buoi1;
import java.util.Scanner;

public class Sum {
    public void sum1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia tri so a:");
        int a = scanner.nextInt();
        System.out.print("Nhap gia tri so b:");
        int b = scanner.nextInt();
        System.out.println("Tong gia tri so a + b = " + (a + b));
        System.out.println("----------------------------------------------");
    }
    
}
