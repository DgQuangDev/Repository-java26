package buoi2;
import java.util.Scanner;

public class Main {
    static void Menu(){
        System.out.println("1.Tinh chu vi , dien tich HCN");
        System.out.println("2.Nhap vao thong tin ca nhan cua ban");
        System.out.println("3.Xuat ra thong tin ca nhan cua ban");
        System.out.println("0.Thoat chuong trinh");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        HCN hcn =new HCN();
        Introduce_myself im = new Introduce_myself();
        do{
            Menu();
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    hcn.hcn1();
                    break;
                case 2:
                    im.InputIntroduce();
                    break;
                case 3:
                    im.OutputIntroduce();
                    break;
                case 0:
                    System.out.println("Ban da thoat chuong trinh");
                    break;
                default:
                    System.out.println("khong hop le");
            }

        }while(chon!=0);
    }
}
