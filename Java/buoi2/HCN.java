package buoi2;
import java.util.Scanner;

public class HCN{
    public void hcn1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chieu rong HCN: ");
        float width= sc.nextFloat();
        System.out.print("Nhap chieu dai HCN: ");
        float height = sc.nextFloat();
        if (width > height) {
            System.out.println("Thong tin nhap vao sai");
            System.out.println("----------------------------------------------------------------");
        }
        else{
            System.out.println("Chu vi HCN: " + (width+height)*2);
            System.out.println("-------------------------------------------------");
            System.out.println("Dien tich HCN: " + width*height);
            System.out.println("-------------------------------------------------");
        }

    }
}