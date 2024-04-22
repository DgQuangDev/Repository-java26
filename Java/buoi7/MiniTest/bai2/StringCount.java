package bai2;
import java.util.Scanner;

public class StringCount {
    public void count(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        int count = str.length();
        System.out.println("So ky tu trong chuoi la: " + count );
    }
    public static void main(String[] args) {
        StringCount s = new StringCount();
        s.count();
    }

}
